package Round09_Examples;

import java.io.*;

public class Round09_Ex01 extends Object implements Serializable {
	private int[] sub; // Field

	private float avg; // Field

	public Round09_Ex01() { // Construct
		sub = new int[4];
		avg = 0.0f;
	}

	public void calc() { // �޼���
		int tot = 0;
		for (int a = 0; a < sub.length; a++) {
			tot += sub[a];
		}
		avg = tot / sub.length;
	}

	public static class Round09_01_Inner { // Nested class
		private String[] subname = { "����", "����", "����" }; // Field

		public String getSubname(int x) { // �޼���
			return subname[x];
		}
	}
}
