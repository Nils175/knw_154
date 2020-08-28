/**
 * The interface IProductDAO provides methods to perform CRUD operations
 * for the product management
 */

package ch.ilv.crm.persistence.product;

import java.util.UUID;

import ch.ilv.crm.persistence.product.dto.ProductDTO;

//Interface declaration
public interface IProductDAO {
	
	/**
	 * Inserts the data of a product
	 * @param customer
	 */
	public void insertProduct(ProductDTO product);
	
	/**
	 * @param customerId
	 * @return The Data of the selected product
	 */
	public ProductDTO selectProduct(int productId);
	
}