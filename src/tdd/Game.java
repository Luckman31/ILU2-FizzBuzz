package tdd;

public class Game {
	private int NbQuille=0;
	private int[] NbQuilles=new int[21];
	void roll (int...NbQuilles) {
		for(int quilleTombe:NbQuilles) {
			NbQuilles[NbQuille++]=quilleTombe;
		}
	}
	int score() {
		int score=0;
		for(int i=0;i<10;i++) {
			score+=NbQuilles[i];
		}
		return score;
		
		
	}
}
