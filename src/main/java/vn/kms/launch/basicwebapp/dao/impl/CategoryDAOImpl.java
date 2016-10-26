package vn.kms.launch.basicwebapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.kms.launch.basicwebapp.dao.CategoryDAO;
import vn.kms.launch.basicwebapp.exception.GeneralException;
import vn.kms.launch.basicwebapp.model.Product;
import vn.kms.launch.basicwebapp.model.ProductCategory;
import vn.kms.launch.basicwebapp.web.utils.ConnectionManager;

public class CategoryDAOImpl extends GenericDAOImpl<ProductCategory, Long> implements CategoryDAO {
    private static final Logger LOG = LoggerFactory.getLogger(CategoryDAOImpl.class.getCanonicalName());
    private static final String SELECT_CATEGORY_BY_ID = "SELECT * FROM CATEGORIES WHERE  ID = ?";
    
    @Override
    public void save(ProductCategory entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ProductCategory getById(Long id) {
        ProductCategory result = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionManager.getConnection();
            statement = connection.prepareStatement(SELECT_CATEGORY_BY_ID);
            statement.setLong(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                result = generateEntity(resultSet);
                LOG.debug("Found Product with id = " + id);
            }
        } catch (Exception e) {
            throw new GeneralException("Cannot get Product by id", e);
        } finally {
            ConnectionManager.close(resultSet);
            ConnectionManager.close(statement);
            ConnectionManager.close(connection);
        }
        return result;
        
    }

    @Override
    public List<ProductCategory> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<ProductCategory> getEntityClass() {
        // TODO Auto-generated method stub
        return ProductCategory.class;
    }

    @Override
    protected ProductCategory generateEntity(ResultSet resultSet) {
        // TODO Auto-generated method stub
        try {
            ProductCategory product = new ProductCategory();
            product.setCategoryId(resultSet.getLong("PRODUCT_ID"));
            product.setCategoryName(resultSet.getString("PRODUCT_NAME"));
//            product.setCategory(ProductCategory.valueOf(resultSet.get));
          
            return product;
        } catch (SQLException e) {
            throw new GeneralException("Cannot generate entity product from result set", e);
        }
    }
    
    

}
