package exchange;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass { //Ŭ���� ����
	private FileWriter fw; //��ü ȣ��
	private boolean isFileExist;
	
	public FileWriteClass() { 
		try {
			File file = new File(ConstValueClass.FILE);
			if(file.exists() == false) { //������ �����Ǿ� ���� ������
				isFileExist = false; //�������纯���� false���� ������
			} else { //������ �����Ǿ� ������
				isFileExist = true; //�������纯���� true���� ������
			}
			fw = new FileWriter(ConstValueClass.FILE,true);
			//���ϰ�ο� fw�� ���ٿ��� ��� ���ش�.
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException { //������� �޼ҵ� ����
		if(isFileExist == false) { //������ �����Ǿ� ���� �ʴٸ�
			String head = "��¥," + "ȯ�����," + "�ݾ�(��)," + "ȯ�����," 
						+ "ȯ����������," +"�Ž�����(��),"+"�Ž���������(10�� ����)" + "\n";
			fw.write(head); //����� ���Ͽ� ����
		}		
	}
	
	public void dataWrite(ExchangeType exType) throws IOException {
		//�����͸� ���� �޼ҵ� ����
		Calendar c = Calendar.getInstance(); //��¥ ���� ���� Calendar ��ü ����
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //��¥/�ð����� ����
		//�� �ٿ� �� 
		String result = sdf.format(c.getTime()) + "," + exType.exchangetype + "," + exType.w + "," 
						+ exType.exchange + "," + exType.exchangeresult + "," + exType.cw + "," 
						+ exType.returnWon + "\n";
		fw.write(result);
	}	
}