package list;

public interface ProductServiceI {
	
	List<Product> getAllProducts();
	Optional<Product> getProductById(Long  productId);
	Product saveProduct(ProductDTO productDTO);
	Product updateProduct(ProductDTO productDTO);
	void deleteProduct(Long  productId);

}
