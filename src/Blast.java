
import java.util.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blast {
	public static String reverse(String s)
	{
		String r_s= "";
		char [] a = s.toCharArray();
		for(int i =a.length-1;i>=0;i--)
		{
			r_s += a[i];
		}
		return r_s;
	}
	public String pairaln(String seq1, String seq2){
		// scoring scheme
		int MATCH    =  1; // +1 for letters that match
		int MISMATCH = -1; // -1 for letters that mismatch
		int GAP      = -1; // -1 for any gap
		
		// initialization
		int l1=seq1.length()+1;
		int l2=seq2.length()+1;
		int [][]score=new int[l2][l1];
		int [][]pointer=new int [l2][l1];
		score[0][0]   = 0;
		pointer[0][0] = 0;
		for(int j = 1; j < l1; j++) {
			
	    		score[0][j]   = GAP * j;
	    		pointer[0][j] = 2;
		}
 
		for (int i = 1; i < l2; i++) {
	    	score[i][0]   = GAP * i;
	    	pointer[i][0] = 3;
		}
 
		// fill
		
		for(int i = 1; i < l2; i++) 
		{
 
			int letter2 = seq2.charAt(i-1);
	 
	    		for(int j = 1; j < l1; j++) 
	    		{
	        		int diagonal_score, left_score, up_score;
 
	        		// calculate match score
	        		
	        		int letter1 = seq1.charAt(j-1);                        
	        		
	        		if (letter1 == letter2) 
	        		{
	            			diagonal_score = score[i-1][j-1] + MATCH;
	        		}
	        		
	        		else 
	        		{
	            			diagonal_score = score[i-1][j-1] + MISMATCH;
	        		}
 
	        		// calculate gap scores
	        		
	        		up_score   = score[i-1][j] + GAP;
	        		left_score = score[i][j-1] + GAP;
 
	        		// choose best score
	        		
	        		if (diagonal_score >= up_score) 
	        		{
	            			if (diagonal_score >= left_score) 
	            			{
	                			score[i][j]   = diagonal_score;
	                			pointer[i][j] = 1;
	            			}
	        			
	            			else 
	            			{
	                			score[i][j]   = left_score;
	                			pointer[i][j] = 2;
	            			}
	        		
	        		} 
	        		else 
	        		{
	        			if (up_score >= left_score) 
	        			{
	                		score[i][j]   = up_score;
	                		pointer[i][j] = 3;
	            		}	
	        			else 
	        			{
	                		score[i][j]   = left_score;
	                		pointer[i][j] = 2;
	            		}
	        		}
	    		}
		}
 
		// trace-back
		
		String align1="";
		String align2="";
 
		// start at last cell of matrix
 
		int j = l1-1;
		int i = l2-1;
 
		while (true) {
	    
	    		if(pointer[i][j] == 0)break ;// ends at first cell of matrix
 
	    		if (pointer[i][j] == 1) {
	        
	        		align1 += seq1.charAt(j-1);
	        		align2 += seq2.charAt(i-1);
	        		i--;
	        		j--;
	    		}
	    		
	    		if (pointer[i][j] == 2) {
	        
	        		align1 += seq1.charAt(j-1);
	        		align2 += "-";
	        		j--;
	    		}
	    		
	    		if (pointer[i][j] == 3) {
	        
	        		align1 += "-";
	        		align2 += seq2.charAt(i-1);
	        		i--;
	    		}    
		}
 
		//reverse align
		align1=reverse(align1);
		align2=reverse(align2);
		
		try {
			FileWriter a=new FileWriter(DBG.outpass+"BLAST_"+DBG.output_pos);
			a.write("S");
			a.write(align1);
			a.write("\r\n");
			a.write(" ");
			for(int y=0;y<align1.length();y++) {
				if(align1.charAt(y)==align2.charAt(y)) {
					a.write("|");
				}else {
					a.write("*");
				}
			}
			a.write("\r\n");
			a.write("R");
			a.write(align2);
			a.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		String align_1="";
		String align_2="";
		for(int a=0;a<align1.length();a++) {
			if(align1.charAt(a)=='-') {
				StringBuffer f=new StringBuffer(align_1);
				f.append("-");
				align_1=f.toString();
				StringBuffer _f=new StringBuffer(align_2);
				_f.append("█");
				align_2=_f.toString();
			}
			if(align2.charAt(a)=='-') {
				StringBuffer _f=new StringBuffer(align_1);
				_f.append("█");
				align_1=_f.toString();
				StringBuffer f=new StringBuffer(align_2);
				f.append("-");
				align_2=f.toString();
			}
			if(align1.charAt(a)!='-'&&align2.charAt(a)!='-'&&align1.charAt(a)==align2.charAt(a)) {
				StringBuffer f=new StringBuffer(align_1);
				f.append("█");
				align_1=f.toString();
				StringBuffer _f=new StringBuffer(align_2);
				_f.append("█");
				align_2=_f.toString();
			}
			if(align1.charAt(a)!='-'&&align2.charAt(a)!='-'&&align1.charAt(a)!=align2.charAt(a)) {
				StringBuffer f=new StringBuffer(align_1);
				f.append("*");
				align_1=f.toString();
				StringBuffer _f=new StringBuffer(align_2);
				_f.append("*");
				align_2=_f.toString();
			}
		}
		try {
			FileWriter a=new FileWriter(DBG.outpass+"GUI_BLAST_"+DBG.output_pos);
			a.write("S");
			a.write(align_1);
			a.write("\r\n");
			a.write("S");
			a.write(align_1);
			a.write("\r\n");
			a.write("S");
			a.write(align_1);
			a.write("\r\n");
			a.write("S");
			a.write(align_1);
			a.write("\r\n");
			a.write("S");
			a.write(align_1);
			a.write("\r\n");
			a.write("\r\n");			a.write("\r\n");			a.write("\r\n");			a.write("\r\n");
			a.write("R");
			a.write(align_2);
			a.write("\r\n");
			a.write("R");
			a.write(align_2);
			a.write("\r\n");
			a.write("R");
			a.write(align_2);
			a.write("\r\n");
			a.write("R");
			a.write(align_2);
			a.write("\r\n");
			a.write("R");
			a.write(align_2);
			a.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	return null;
	}
	
	public void BLAST() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f=new BufferedReader(new InputStreamReader(new FileInputStream(DBG.outpass+DBG.output_pos)));
		String seq1=f.readLine();
		BufferedReader f_reference=new BufferedReader(new InputStreamReader(new FileInputStream(DBG.reference_pos)));
		String seq2=f_reference.readLine();
		pairaln(seq1, seq2);
		f.close();
		f_reference.close();
		
	}
 
}
