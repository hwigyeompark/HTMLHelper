package kr.hs.dgsw.twb.repository;

import java.util.List;

import kr.hs.dgsw.twb.domain.User;

public interface UserRepository
{
	/**
	 * ����ڸ� �߰��Ѵ�.
	 *  
	 * @param user �����
	 * @return ����� ���̵�
	 * @throws RuntimeException �����ͺ��̽� �۾��� ������ ���� ��� �߻��Ѵ�.
	 */
	public int add(User user) throws RuntimeException;
	
	// ����
	public void update(User user) throws RuntimeException;
	
	// ����
	public void delete(int userId) throws RuntimeException;
	
	// ��ȸ - ���
	public List<User> list() throws RuntimeException;
	
	// �� ��ȸ
	public User read(int userId) throws RuntimeException;
	
	public User read(String email) throws RuntimeException;
}
