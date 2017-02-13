package cn.jianke.allactiontracingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

/**
 * @className: 首页
 * @classDescription: MainActivity
 * @author: leibing
 * @createTime: 2017/2/13
 */
public class MainActivity extends AppCompatActivity {
    // 用户列表
    private ArrayList<User> mUserList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建用户对象
        createUser();
    }

    /**
     * 创建用户对象
     * @author leibing
     * @createTime 2017/2/13
     * @lastModify 2017/2/13
     * @param
     * @return
     */
    private void createUser() {
        mUserList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUserName("lei" + i);
            user.setUserAge(i + 18);
            mUserList.add(user);
        }
    }
}
