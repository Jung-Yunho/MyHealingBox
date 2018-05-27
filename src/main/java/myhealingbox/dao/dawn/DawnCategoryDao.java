package myhealingbox.dao.dawn;

import java.util.List;

import myhealingbox.entity.dawn.DawnCategory;

public interface DawnCategoryDao {

	List<DawnCategory> getList();

	int insert(DawnCategory dawnCategory);

	int update(DawnCategory dawnCategory);

	int delete(Integer id);

}
