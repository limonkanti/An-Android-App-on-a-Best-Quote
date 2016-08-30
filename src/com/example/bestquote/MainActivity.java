package com.example.bestquote;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
public class MainActivity  extends ListActivity {

	static final String[] person = new String[] {"Swami Vivekananda", "Abdul Kalam", "Mahatma Gandhi", "Nelson Mandela",
			"Mother Teresa","Steve Jobs","Bill Gates","Abraham Lincoln","Helen Keller","About"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_quotelist,person));

		final ListView listView = getListView();
		listView.setTextFilterEnabled(true);

		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				String selectedValue = (String) getListAdapter().getItem(position);
				
				if(selectedValue.equals("Swami Vivekananda"))
				{
					Intent intent = new Intent(MainActivity.this, Swami.class);
				     startActivity(intent);
				   
				}
				
				if(selectedValue.equals("Abdul Kalam"))
				{
					Intent intent = new Intent(MainActivity.this, Kalam.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Mahatma Gandhi"))
				{
					Intent intent = new Intent(MainActivity.this, Mahatma.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Nelson Mandela"))
				{
					Intent intent = new Intent(MainActivity.this, Mandela.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Mother Teresa"))
				{
					Intent intent = new Intent(MainActivity.this, Teresa.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Steve Jobs"))
				{
					Intent intent = new Intent(MainActivity.this, Steve.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Bill Gates"))
				{
					Intent intent = new Intent(MainActivity.this, Gates.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Abraham Lincoln"))
				{
					Intent intent = new Intent(MainActivity.this, Lincoln.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("Helen Keller"))
				{
					Intent intent = new Intent(MainActivity.this, Keller.class);
				     startActivity(intent);
				     
				}
				if(selectedValue.equals("About"))
				{
					Intent intent = new Intent(MainActivity.this, About.class);
				     startActivity(intent);
				     
				}
			 
			}

		});

	}

}