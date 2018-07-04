package kr.hs.dgsw.twb.repository;

import java.util.List;

import kr.hs.dgsw.twb.domain.UserFile;

public interface UserFileRepository {

	//���ϻ���
	public int create(int userId, UserFile userFile) throws RuntimeException;
	
	//�����б�
	public UserFile read(int userFileId) throws RuntimeException;
	
	//���Ͼ�����Ʈ
	public void update(UserFile userFile) throws RuntimeException;
	
	//���������
	public void delete(int userFileId) throws RuntimeException;
	
	//�ڱ��� ��������б�
	public List<UserFile> list(int userFileId, int index) throws RuntimeException;
	
	//Ư�������� ���� ���� ���ϱ�
	public int getCount(int userId) throws RuntimeException;
	
	//���� �̸����� �ߺ��� �̸� �ִ��� ã��
	public int findDuplicateName(int userId, String title) throws RuntimeException;
}
