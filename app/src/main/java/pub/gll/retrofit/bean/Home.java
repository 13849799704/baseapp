package pub.gll.retrofit.bean;

import java.util.List;

public class Home {


    /**
     * code : 200
     * msg : 获取成功
     * data : {"siteurl":"www.iimpath.com","banner":[{"id":4,"title":"","image":"/uploads/20180928/78375988f67286a76e50da692ea96ab7.jpg","url":"","weigh":4,"createtime":1538144264,"updatetime":1538144264},{"id":7,"title":"","image":"/uploads/20181018/95cc8ea327a7c2e64a4af3e0ea5c852a.jpg","url":"","weigh":7,"createtime":1539795225,"updatetime":1539795225},{"id":10,"title":"健康值多少","image":"/uploads/20181226/24650c26cd527a0d23c4a26fc9f2bc2f.jpg","url":"http://www.iimpath.com/index/video/index.html","weigh":10,"createtime":1545834137,"updatetime":1550903749},{"id":12,"title":"","image":"/uploads/20181226/08a572211b03bbcb6cc53ae1e5e49e43.png","url":"http://www.iimpath.com/index/apps/detail/ids/85.html","weigh":10,"createtime":1545834526,"updatetime":1545834526}],"video":{"id":40,"time":"0时25分","hits":51,"createtime":1545381417,"title":"第9讲 脂肪肝不是病","image":"/uploads/20181222/fb3355da928df62a2db7a3f9906538d9.jpg","list_desc":" 脂肪肝不是病"},"videos":[{"id":182,"time":"24分19秒","hits":0,"createtime":1550745650,"title":"纪小龙医生--腿没劲要留心","image":"/uploads/20190221/7b6c7075c67e2e1af11967229419f84b.jpg","list_desc":"腰椎间盘突出、尿毒症、小中风"},{"id":172,"time":"24分50秒","hits":11,"createtime":1548902819,"title":"纪小龙医生--萎缩性胃炎、宫颈糜烂、HPV、单纯性肝囊肿","image":"/uploads/20190131/f0117de7cde6f3cbd94f97282a3adeac.jpg","list_desc":"萎缩性胃炎、宫颈糜烂、HPV、单纯性肝囊肿"},{"id":181,"time":"22分56秒","hits":8,"createtime":1549872584,"title":"纪小龙医生- 听懂食管的\u201csos\u201d","image":"/uploads/20190211/36ce462cc03f4628500106e2f633f6e1.jpg","list_desc":"胃食管反流；反酸；咽喉炎；哮喘；"},{"id":180,"time":"23分37秒","hits":3,"createtime":1549377203,"title":"纪小龙医生--嗓子有东西会是大事吗","image":"/uploads/20190205/5abc209f3e2271be2c70c1b02ddcc783.jpg","list_desc":"咽炎；急性会厌炎；食管癌；"},{"id":179,"time":"19分38秒","hits":1,"createtime":1549205443,"title":"纪小龙医生--腰肌劳损","image":"/uploads/20190203/d456adbac048071ca16dc9b6e7ea6e8e.jpg","list_desc":"腰肌劳损；隐痛；刺痛；带状疱疹"},{"id":176,"time":"24分22秒","hits":11,"createtime":1548913305,"title":"纪小龙医生--关于肺活量你要知道的","image":"/uploads/20190131/51f8878db4c689c772710e9fdc1c68de.jpg","list_desc":"肺活量；"},{"id":177,"time":"22分46秒","hits":14,"createtime":1548913839,"title":"纪小龙医生--各种检查是怎么回事","image":"/uploads/20190131/807cc247895004bf0cec9f195218b509.jpg","list_desc":"CT（电子计算机断层扫描）； B超（超声）； X光；"},{"id":178,"time":"14分44秒","hits":8,"createtime":1548925038,"title":"纪小龙医生-- 另类胸闷也\u201c凶险\u201d","image":"/uploads/20190131/5e6ef42d1d2395afec00e2f52e743ee3.jpg","list_desc":"胸闷；慢阻肺；颈椎病；"},{"id":175,"time":"19分57秒","hits":15,"createtime":1548912772,"title":"纪小龙医生--牙疼的秘密","image":"/uploads/20190131/27190cb9ee56672d5cf62bedb65903c9.jpg","list_desc":"龋齿；肺炎；糖尿病；心脏病；"},{"id":174,"time":"11分53秒","hits":17,"createtime":1548905068,"title":"健康知多少--真酒无毒，举杯有度","image":"/uploads/20190131/2adee9026b059ea4c0b0c7754f293864.jpg","list_desc":"喝酒；"}]}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
         * siteurl : www.iimpath.com
         * banner : [{"id":4,"title":"","image":"/uploads/20180928/78375988f67286a76e50da692ea96ab7.jpg","url":"","weigh":4,"createtime":1538144264,"updatetime":1538144264},{"id":7,"title":"","image":"/uploads/20181018/95cc8ea327a7c2e64a4af3e0ea5c852a.jpg","url":"","weigh":7,"createtime":1539795225,"updatetime":1539795225},{"id":10,"title":"健康值多少","image":"/uploads/20181226/24650c26cd527a0d23c4a26fc9f2bc2f.jpg","url":"http://www.iimpath.com/index/video/index.html","weigh":10,"createtime":1545834137,"updatetime":1550903749},{"id":12,"title":"","image":"/uploads/20181226/08a572211b03bbcb6cc53ae1e5e49e43.png","url":"http://www.iimpath.com/index/apps/detail/ids/85.html","weigh":10,"createtime":1545834526,"updatetime":1545834526}]
         * video : {"id":40,"time":"0时25分","hits":51,"createtime":1545381417,"title":"第9讲 脂肪肝不是病","image":"/uploads/20181222/fb3355da928df62a2db7a3f9906538d9.jpg","list_desc":" 脂肪肝不是病"}
         * videos : [{"id":182,"time":"24分19秒","hits":0,"createtime":1550745650,"title":"纪小龙医生--腿没劲要留心","image":"/uploads/20190221/7b6c7075c67e2e1af11967229419f84b.jpg","list_desc":"腰椎间盘突出、尿毒症、小中风"},{"id":172,"time":"24分50秒","hits":11,"createtime":1548902819,"title":"纪小龙医生--萎缩性胃炎、宫颈糜烂、HPV、单纯性肝囊肿","image":"/uploads/20190131/f0117de7cde6f3cbd94f97282a3adeac.jpg","list_desc":"萎缩性胃炎、宫颈糜烂、HPV、单纯性肝囊肿"},{"id":181,"time":"22分56秒","hits":8,"createtime":1549872584,"title":"纪小龙医生- 听懂食管的\u201csos\u201d","image":"/uploads/20190211/36ce462cc03f4628500106e2f633f6e1.jpg","list_desc":"胃食管反流；反酸；咽喉炎；哮喘；"},{"id":180,"time":"23分37秒","hits":3,"createtime":1549377203,"title":"纪小龙医生--嗓子有东西会是大事吗","image":"/uploads/20190205/5abc209f3e2271be2c70c1b02ddcc783.jpg","list_desc":"咽炎；急性会厌炎；食管癌；"},{"id":179,"time":"19分38秒","hits":1,"createtime":1549205443,"title":"纪小龙医生--腰肌劳损","image":"/uploads/20190203/d456adbac048071ca16dc9b6e7ea6e8e.jpg","list_desc":"腰肌劳损；隐痛；刺痛；带状疱疹"},{"id":176,"time":"24分22秒","hits":11,"createtime":1548913305,"title":"纪小龙医生--关于肺活量你要知道的","image":"/uploads/20190131/51f8878db4c689c772710e9fdc1c68de.jpg","list_desc":"肺活量；"},{"id":177,"time":"22分46秒","hits":14,"createtime":1548913839,"title":"纪小龙医生--各种检查是怎么回事","image":"/uploads/20190131/807cc247895004bf0cec9f195218b509.jpg","list_desc":"CT（电子计算机断层扫描）； B超（超声）； X光；"},{"id":178,"time":"14分44秒","hits":8,"createtime":1548925038,"title":"纪小龙医生-- 另类胸闷也\u201c凶险\u201d","image":"/uploads/20190131/5e6ef42d1d2395afec00e2f52e743ee3.jpg","list_desc":"胸闷；慢阻肺；颈椎病；"},{"id":175,"time":"19分57秒","hits":15,"createtime":1548912772,"title":"纪小龙医生--牙疼的秘密","image":"/uploads/20190131/27190cb9ee56672d5cf62bedb65903c9.jpg","list_desc":"龋齿；肺炎；糖尿病；心脏病；"},{"id":174,"time":"11分53秒","hits":17,"createtime":1548905068,"title":"健康知多少--真酒无毒，举杯有度","image":"/uploads/20190131/2adee9026b059ea4c0b0c7754f293864.jpg","list_desc":"喝酒；"}]
         */

        private String siteurl;
        private VideoBean video;
        private List<BannerBean> banner;
        private List<VideosBean> videos;

        public String getSiteurl() {
            return siteurl;
        }

        public void setSiteurl(String siteurl) {
            this.siteurl = siteurl;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<VideosBean> getVideos() {
            return videos;
        }

        public void setVideos(List<VideosBean> videos) {
            this.videos = videos;
        }

        public static class VideoBean {
            /**
             * id : 40
             * time : 0时25分
             * hits : 51
             * createtime : 1545381417
             * title : 第9讲 脂肪肝不是病
             * image : /uploads/20181222/fb3355da928df62a2db7a3f9906538d9.jpg
             * list_desc :  脂肪肝不是病
             */

            private int id;
            private String time;
            private int hits;
            private int createtime;
            private String title;
            private String image;
            private String list_desc;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public int getCreatetime() {
                return createtime;
            }

            public void setCreatetime(int createtime) {
                this.createtime = createtime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getList_desc() {
                return list_desc;
            }

            public void setList_desc(String list_desc) {
                this.list_desc = list_desc;
            }
        }

        public static class BannerBean {
            /**
             * id : 4
             * title :
             * image : /uploads/20180928/78375988f67286a76e50da692ea96ab7.jpg
             * url :
             * weigh : 4
             * createtime : 1538144264
             * updatetime : 1538144264
             */

            private int id;
            private String title;
            private String image;
            private String url;
            private int weigh;
            private int createtime;
            private int updatetime;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWeigh() {
                return weigh;
            }

            public void setWeigh(int weigh) {
                this.weigh = weigh;
            }

            public int getCreatetime() {
                return createtime;
            }

            public void setCreatetime(int createtime) {
                this.createtime = createtime;
            }

            public int getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(int updatetime) {
                this.updatetime = updatetime;
            }
        }

        public static class VideosBean {
            /**
             * id : 182
             * time : 24分19秒
             * hits : 0
             * createtime : 1550745650
             * title : 纪小龙医生--腿没劲要留心
             * image : /uploads/20190221/7b6c7075c67e2e1af11967229419f84b.jpg
             * list_desc : 腰椎间盘突出、尿毒症、小中风
             */

            private int id;
            private String time;
            private int hits;
            private int createtime;
            private String title;
            private String image;
            private String list_desc;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public int getCreatetime() {
                return createtime;
            }

            public void setCreatetime(int createtime) {
                this.createtime = createtime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getList_desc() {
                return list_desc;
            }

            public void setList_desc(String list_desc) {
                this.list_desc = list_desc;
            }
        }
    }
}
