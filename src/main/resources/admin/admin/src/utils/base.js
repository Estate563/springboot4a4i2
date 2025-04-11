const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4a4i2/",
            name: "springboot4a4i2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4a4i2/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "流浪猫狗救助系统"
        } 
    }
}
export default base
