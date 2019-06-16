package list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
@RequestMapping("api")
public class ProductController {

    @Autowired
    ProductServiceI productServiceI;

    @GetMapping("/products")
    public List<Product>  getAllProducts(); {
        return productServiceI.getAllProducts();;
    }

    @GetMapping("/products/{productId}")
    public Optional<Product>  getProductById(@PathVariable Long productId) {
        return productServiceI.getProductById(productId);
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody ProductDTO productDTO) {
        return productServiceI.saveProduct(productDTO);
    }

    @PutMapping("/products/{productId}")
    public Product updateProduct(@RequestBody ProductDTO productDTO) {
        return productServiceI.updateProduct(productDTO);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        return productServiceI.deleteProduct(productId);
    }
}

