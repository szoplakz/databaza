package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class AuthorReviewRowMapper implements RowMapper<AuthorReview>{

    @Override
    public AuthorReview mapRow(ResultSet rs, int i) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
