package pub.gll.retrofit.bean;

public class LoginData {
    /**
     * code : 200
     * msg : 登录成功
     * data : {"id":26,"username":"15124032522","email":"986445685@qq.com","tel":"15124032522","sex":1,"avatar":"upload/20190309\\a91bc8b4c81f5be89bc4f285003b70f5.jpg","city":null,"introduce":null,"createtime":"2019","approve_status":0,"approve_title":null,"yun_token":"f9c07e3a26fe5b334a6ae0d6d56d7160","yun_accid":"15124032521"}
     */

    private String code;
    private String msg;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 26
         * username : 15124032522
         * email : 986445685@qq.com
         * tel : 15124032522
         * sex : 1
         * avatar : upload/20190309\a91bc8b4c81f5be89bc4f285003b70f5.jpg
         * city : null
         * introduce : null
         * createtime : 2019
         * approve_status : 0
         * approve_title : null
         * yun_token : f9c07e3a26fe5b334a6ae0d6d56d7160
         * yun_accid : 15124032521
         */

        private int id;
        private String username;
        private String email;
        private String tel;
        private int sex;
        private String avatar;
        private Object city;
        private Object introduce;
        private String createtime;
        private int approve_status;
        private Object approve_title;
        private String yun_token;
        private String yun_accid;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public Object getIntroduce() {
            return introduce;
        }

        public void setIntroduce(Object introduce) {
            this.introduce = introduce;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public int getApprove_status() {
            return approve_status;
        }

        public void setApprove_status(int approve_status) {
            this.approve_status = approve_status;
        }

        public Object getApprove_title() {
            return approve_title;
        }

        public void setApprove_title(Object approve_title) {
            this.approve_title = approve_title;
        }

        public String getYun_token() {
            return yun_token;
        }

        public void setYun_token(String yun_token) {
            this.yun_token = yun_token;
        }

        public String getYun_accid() {
            return yun_accid;
        }

        public void setYun_accid(String yun_accid) {
            this.yun_accid = yun_accid;
        }
    }
}
