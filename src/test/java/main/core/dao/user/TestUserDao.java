package main.core.dao.user;

import com.main.core.dao.user.UserDao;
import com.main.core.entity.user.MaBsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liujinshan
 * @ClassName: TestUserDao
 * @Description:
 * @date 2018/4/11 21:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-hibernate-junit.xml","classpath:/spring.xml","classpath:/springmvc.xml" })
public class TestUserDao extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void save() {
        MaBsUser maBsUser = new MaBsUser();
        maBsUser.setLoingId("170026");
        maBsUser.setPassword("Taier12");
        maBsUser.setUserName("刘金山");
        maBsUser.setDeptName("软件开发部");
        maBsUser.setRkDept(10010);
        maBsUser.setBirthdate("2018-04-13");
        userDao.save(maBsUser);
    }

    @Test
    public void getbyid(){
        System.out.println(userDao.getbyId(10l).toString());
    }

    @Test
    public void update(){
        MaBsUser maBsUser = userDao.getbyId(10l);
        maBsUser.setAge(22);
        maBsUser.setCorpName("测试");
        maBsUser.setCreatorId(10);
        userDao.update(maBsUser);
    }
}
