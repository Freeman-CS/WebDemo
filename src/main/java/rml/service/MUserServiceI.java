package rml.service;

import java.util.List;
import java.util.Map;

import rml.model.MUser;

public interface MUserServiceI {

	List<MUser> getAll();
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
    
    List<Map> getData();
}
