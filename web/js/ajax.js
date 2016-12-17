/**
 * Created by 隽 on 2016/12/17.
 */
function createAJAX() {
    var ajax=null;
    try{
        //如果为低级的ie
        ajax=new ActiveXObject("microsoft.xmlhttp");
    }catch (e1){
        try{
            //如果是其他的浏览器
            ajax=new XMLHttpRequest();
        }catch (e2){
            //不支持ajax
            alert("不支持ajax");
        }
    }
    return ajax;
}