package custom;

public class ProductServiceImpl implements ProductServiceI{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	Messages messageService;

	@Override
	public OffersResponse getAllProducts() {

		List<Product> productList = productRepository.findAll();
		OffersResponse offersResponse = new OffersResponse();
		if(!StringUtils.isEmpty(productList)) {
			List<ProductDTO> productDTOList = getProductDTOList(productList);
			offersResponse.setMessage(messageService.getMessage("success.message"));
			offersResponse.setStatus(HttpStatus.OK.value());
			offersResponse.setPayLoad(productDTOList);
			return offersResponse;
		}
		else {
			offersResponse.setMessage(messageService.getMessage("product.no"));
			offersResponse.setStatus(HttpStatus.OK.value());
			return offersResponse;
		}
		
	}

	private List<ProductDTO> getProductDTOList(List<Product> productList) {
		List<ProductDTO> productDTOList = new ArrayList<>();
		for(Product product : productList) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductId(product.getProductId());
			productDTO.setProductName(product.getProductName());
			productDTO.setPassword(product.getPassword());
			productDTO.setRole(product.getRole());
           productDTOList.add(productDTO);
		}
		return productDTOList;
	}

	@Override
	public OffersResponse getProductById(Long productId) {
		OffersResponse offersResponse = new OffersResponse();
		if(!StringUtils.isEmpty(productId)) {
			Optional<Product> optionalProduct = productRepository.findById(productId);
			if(optionalProduct.isPresent()) {
				List<Product> productList = new ArrayList<>();
				Product product = optionalProduct.get();
				productList.add(product);
				List<ProductDTO> productDTOList = getProductDTOList(productList);
				offersResponse.setMessage("success.message");
				offersResponse.setStatus(HttpStatus.OK.value());
				offersResponse.setPayLoad(productDTOList);
			}
			else {
				offersResponse.setMessage(messageService.getMessage("product.no"));
				offersResponse.setStatus(HttpStatus.OK.value());
			}
		}
		else {
			offersResponse.setMessage(messageService.getMessage("invalid.data"));
			offersResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		}
		
		return offersResponse;
	}

	@Override
	public OffersResponse saveProduct(ProductDTO productDTO) {
		OffersResponse offersResponse = new OffersResponse();
		if(productDTO != null) {
			Product product = new Product();
			product = getProduct(productDTO,product);
			productRepository.save(product);
			offersResponse.setStatus(HttpStatus.OK.value());
			offersResponse.setMessage(messageService.getMessage("product.save"));
		}
		else {
			offersResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			offersResponse.setMessage(messageService.getMessage("invalid.data"));
		}
		return null;
	}

	@Override
	public OffersResponse updateProduct(ProductDTO productDTO) {
		OffersResponse offersResponse = new OffersResponse();
		if(productDTO !=null) {
			Optional<Product> optionalProduct = productRepository.findById(productDTO.getProductId());
			if(optionalProduct.isPresent()) {
				Product product = getProduct(productDTO, optionalProduct.get());
			    productRepository.save(product);
			    offersResponse.setStatus(HttpStatus.OK.value());
			    offersResponse.setMessage(messageService.getMessage("product.update"));
			}
			else {
				offersResponse.setStatus(HttpStatus.NOT_FOUND.value());
				offersResponse.setMessage(messageService.getMessage("product.not.found"));
			}
		}
		else {
			offersResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			offersResponse.setMessage(messageService.getMessage("invalid.data"));
		}
		return offersResponse;
	}

	private Product getProduct(ProductDTO productDTO, Product product) {

		if(!StringUtils.isEmpty(productDTO.getProductName())) {
			product.setProductName(productDTO.getProductName());
		}
		if(!StringUtils.isEmpty(productDTO.getPassword())) {
			product.setPassword(productDTO.getPassword());
		}
		return product;
	}

	@Override
	public OffersResponse deleteProduct(Long productId) {
		OffersResponse offersResponse = new OffersResponse();
		productRepository.deleteById(productId);
		offersResponse.setMessage(messageService.getMessage("product.update"));
		return offersResponse;
	}
	
}


