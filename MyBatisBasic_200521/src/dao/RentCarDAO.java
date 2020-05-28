package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.OfficeBean;

public class RentCarDAO {
	private static SqlSessionFactory sqlSessionFactory;
	static{
		sqlSessionFactory = SqlSessionFactoryManager.getSqlSessionFactory();
	}
	
	public static List<OfficeBean> selectOffice(){

			SqlSession sqlSession = null;
			try {
				sqlSession = sqlSessionFactory.openSession();
				return sqlSession.selectList("selectOffice");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
					sqlSession.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return null;
		}

}
