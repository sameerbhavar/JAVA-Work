package com.masai.q2;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PlayList plist= new PlayList();
		
		while(true) {
			
			
			System.out.println("Enter details of Song "+(plist.getSongs().size()+1));
			System.out.println("Enter Movie Name");
			String mName=sc.next();
			
			System.out.println("Enter Song Name");
			String sName=sc.next();
			
			Song song = new Song(mName, sName);
		
			plist.addSong(song);
			
			if(plist.getSongs().size() == 4)
				break;
		
		}
		
		System.out.println("playing all songs...");
		
		List<Song> songs= plist.getSongs();
		
		for(Song song: songs) {
			
			song.play();
			
		}
		
	}



}
