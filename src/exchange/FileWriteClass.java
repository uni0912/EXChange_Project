package exchange;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass { //클래스 선언
	private FileWriter fw; //객체 호출
	private boolean isFileExist;
	
	public FileWriteClass() { 
		try {
			File file = new File(ConstValueClass.FILE);
			if(file.exists() == false) { //파일이 생성되어 있지 않으면
				isFileExist = false; //파일존재변수는 false값을 가지고
			} else { //파일이 생성되어 있으면
				isFileExist = true; //파일존재변수는 true값을 가진다
			}
			fw = new FileWriter(ConstValueClass.FILE,true);
			//파일경로에 fw가 덧붙여서 계속 써준다.
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
	
	public void headerWrite() throws IOException { //헤더쓰는 메소드 생성
		if(isFileExist == false) { //파일이 생성되어 있지 않다면
			String head = "날짜," + "환전대상," + "금액(원)," + "환전결과," 
						+ "환전지폐지급," +"거스름돈(원),"+"거스름돈지급(10원 단위)" + "\n";
			fw.write(head); //헤더를 파일에 쓴다
		}		
	}
	
	public void dataWrite(ExchangeType exType) throws IOException {
		//데이터를 쓰는 메소드 생성
		Calendar c = Calendar.getInstance(); //날짜 쓰기 위해 Calendar 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //날짜/시간포맷 설정
		//한 줄에 들어갈 
		String result = sdf.format(c.getTime()) + "," + exType.exchangetype + "," + exType.w + "," 
						+ exType.exchange + "," + exType.exchangeresult + "," + exType.cw + "," 
						+ exType.returnWon + "\n";
		fw.write(result);
	}	
}