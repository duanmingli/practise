package dec;

/**
 * 
 * 
 * <p>Title: 市政管网安全运营管理平台 /p>
 *
 * <p>Description: 示例 业务类</p>
 *
 * <p>Copyright: Copyright (c) 2012</p>
 *
 * <p>Company: 西安交大长天软件股份有限公司</p>
 *
 * @author dml@2012-12-25
 * @version 1.0
 */
public class TokenTest {
/**
 * 利用struts的同步令牌机制　　

　　利用同步令牌（Token）机制来解决Web应用中重复提交的问题，Struts也给出了一个参考实现。

　　基本原理：　

　　服务器端在处理到达的请求之前，会将请求中包含的令牌值与保存在当前用户会话中的令牌值进行比较，看是否匹配。在处理完该请求后，且在答复发送给客户端之前，将会产生一个新的令牌，该令牌除传给客户端以外，也会将用户会话中保存的旧的令牌进行替换。这样如果用户回退到刚才的提交页面并再次提交的话，客户端传过来的令牌就和服务器端的令牌不一致，从而有效地防止了重复提交的发生。　

　　if (isTokenValid(request, true)) {

　　 // your code here

　　 return mapping.findForward("success");

　　} else {

　　 saveToken(request);

　　 return mapping.findForward("submitagain");

　　}　

　　Struts根据用户会话ID和当前系统时间来生成一个唯一（对于每个会话）令牌的，具体实现可以参考TokenPRocessor类中的generateToken()方法。　　

　　1. //验证事务控制令牌,<html:form >会自动根据session中标识生成一个隐含input代表令牌，防止两次提交

　　2. 在action中：　　

　　 //<input type="hidden" name="org.apache.struts.taglib.html.TOKEN"

　　 // value="6aa35341f25184fd996c4c918255c3ae">

　　 if (!isTokenValid(request))

　　 errors.add(ActionErrors.GLOBAL_ERROR,

　　 new ActionError("error.transaction.token"));

　　 resetToken(request); //删除session中的令牌　　

　　3. action有这样的一个方法生成令牌　　

　　 
 */
}
