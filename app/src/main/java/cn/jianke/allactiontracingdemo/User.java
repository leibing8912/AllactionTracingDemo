package cn.jianke.allactiontracingdemo;

/**
 * @className: User
 * @classDescription: 用户对象类
 * @author: leibing
 * @createTime: 2017/2/13
 */
public class User {
    // 用户名
    private String userName  = "";
    // 用户年龄
    private int userAge = 0;

    /**--------------get and set-------------
     -------------------------------------- */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
