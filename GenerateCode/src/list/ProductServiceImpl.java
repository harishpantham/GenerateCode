package list;

public class ProductServiceImpl implements ProductServiceI{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	Messages messageService;

	@Override
	public List<Product> getAllProducts() {

		List<Product> productList = productRepository.findAll();
		OffersResponse offersResponse = new OffersResponse();
		if(!StringUtils.isEmpty(productList)) {
			List<ProductDTO> productDTOList = getProductDTOList(productList);
			return productDTOList;
		}
		else {
			
			return productDTOList;
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
	public List<ProductDTO> getProductById(Long productId) {
		
		if(!StringUtils.isEmpty(productId)) {
			Optional<Product> optionalProduct = productRepository.findById(productId);
			if(optionalProduct.isPresent()) {
				List<Product> productList = new ArrayList<>();
				Product product = optionalProduct.get();
				productList.add(product);
				List<ProductDTO> productDTOList = getProductDTOList(productList);
                                return productDTOList;
				
			}
			else {
				return productDTOList;
			}
		}
		else {
			return productDTOList;
		}
		
		return return productDTOList;
	}

	@Override
	public void saveProduct(ProductDTO productDTO) {
		OffersResponse offersResponse = new OffersResponse();
		if(productDTO != null) {
			Product product = new Product();
			product = getProduct(productDTO,product);
			productRepository.save(product);
			
		}
		else {
			return null;
		}
		return null;
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		OffersResponse offersResponse = new OffersResponse();
		if(productDTO !=null) {
			Optional<Product> optionalProduct = productRepository.findById(productDTO.getProductId());
			if(optionalProduct.isPresent()) {
				Product product = getProduct(productDTO, optionalProduct.get());
			    productRepository.save(product);
			    
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
		return null;
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
	public void deleteProduct(Long productId) {
		
		productRepository.deleteById(productId);
		return null;
	}
	
}


