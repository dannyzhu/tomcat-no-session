package org.apache.catalina.DefaultManager;

import java.io.Serializable;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Iterator;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import org.apache.catalina.Manager;
import org.apache.catalina.Session;
import org.apache.catalina.SessionListener;
/**
 * 
* @Description: ʵ��һ���յ�Session���������Դﵽ����tomcatĬ��session���Ƶ�Ŀ��
* �ŵ㣺��ʡ�ڴ棬������ܣ��ҷ������ڼ�Ⱥ����
* @author �����ж� waitfox@qq.com  
* @date 2015��11��29�� ����3:43:45 
* @version V1.0  
* ��ֻΪ�����һЦ����ʹ���������ǣ���ֻΪ�㸶���������������ٴ�����
 */
@SuppressWarnings("deprecation")
public class DefaultSession  implements HttpSession, Session, Serializable{

	@Override
	public void access() {
		
	}

	@Override
	public void addSessionListener(SessionListener arg0) {
		
	}

	@Override
	public void endAccess() {
		
		
	}

	@Override
	public void expire() {
		
		
	}

	@Override
	public String getAuthType() {
		return null;
	}

	@Override
	public long getCreationTimeInternal() {
		return 0;
	}

	@Override
	public String getIdInternal() {
		return null;
	}

	@Override
	public String getInfo() {
		return null;
	}

	@Override
	public long getLastAccessedTimeInternal() {
		return 0;
	}

	@Override
	public Manager getManager() {
		return null;
	}

	@Override
	public Object getNote(String arg0) {
		
		return null;
	}

	@Override
	public Iterator<String> getNoteNames() {
		
		return null;
	}

	@Override
	public Principal getPrincipal() {
		
		return null;
	}

	@Override
	public HttpSession getSession() {
		
		return null;
	}

	@Override
	public long getThisAccessedTime() {
		
		return 0;
	}

	@Override
	public long getThisAccessedTimeInternal() {
		
		return 0;
	}

	@Override
	public boolean isValid() {
		
		return false;
	}

	@Override
	public void recycle() {
		
		
	}

	@Override
	public void removeNote(String arg0) {
		
		
	}

	@Override
	public void removeSessionListener(SessionListener arg0) {
		
		
	}

	@Override
	public void setAuthType(String arg0) {
		
		
	}

	@Override
	public void setCreationTime(long arg0) {
		
		
	}

	@Override
	public void setId(String arg0) {
		
		
	}

	@Override
	public void setId(String arg0, boolean arg1) {
		
		
	}

	@Override
	public void setManager(Manager arg0) {
		
		
	}

	@Override
	public void setNew(boolean arg0) {
		
		
	}

	@Override
	public void setNote(String arg0, Object arg1) {
		
		
	}

	@Override
	public void setPrincipal(Principal arg0) {
		
		
	}

	@Override
	public void setValid(boolean arg0) {
		
		
	}

	@Override
	public Object getAttribute(String arg0) {
		
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		
		return null;
	}

	@Override
	public long getCreationTime() {
		
		return 0;
	}

	@Override
	public String getId() {
		
		return null;
	}

	@Override
	public long getLastAccessedTime() {
		
		return 0;
	}

	@Override
	public int getMaxInactiveInterval() {
		
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		
		return null;
	}

	@Override
	public HttpSessionContext getSessionContext() {
		
		return null;
	}

	@Override
	public Object getValue(String arg0) {
		
		return null;
	}

	@Override
	public String[] getValueNames() {
		
		return null;
	}

	@Override
	public void invalidate() {
		
		
	}

	@Override
	public boolean isNew() {
		
		return false;
	}

	@Override
	public void putValue(String arg0, Object arg1) {
		
		
	}

	@Override
	public void removeAttribute(String arg0) {
			
	}

	@Override
	public void removeValue(String arg0) {		
		
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {	
		
	}

	@Override
	public void setMaxInactiveInterval(int arg0) {
				
	}

}
