package custom;

import com.today.offers.dto.ProductDTO;
import com.today.offers.utils.OffersResponse;

public interface ProductServiceI {
	
	OffersResponse getAllProducts();
	OffersResponse getProductById(Long  productId);
	OffersResponse saveProduct(ProductDTO productDTO);
	OffersResponse updateProduct(ProductDTO productDTO);
	OffersResponse deleteProduct(Long  productId);

}
