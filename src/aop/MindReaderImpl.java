package aop;

public class MindReaderImpl implements MindReader {
	private String thoughts;
    public void interceptThoughts(String thoughts) {
        System.out.println("侦听志愿者的心声");
        this.thoughts=thoughts;
    }
    
    public String getThoughts() {
        return thoughts;
    }

}
