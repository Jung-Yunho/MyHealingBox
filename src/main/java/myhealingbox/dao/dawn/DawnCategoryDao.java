package myhealingbox.dao.dawn;

import java.util.List;

import myhealingbox.entity.dawn.DawnCategory;

public interface DawnCategoryDao {

	List<DawnCategory> getList(Integer page);

	DawnCategory get(Integer id);

	int insert(DawnCategory dawnCategory);
	
	int update(DawnCategory dawnCategory);
	
	int delete(DawnCategory dawnCategory);

}
