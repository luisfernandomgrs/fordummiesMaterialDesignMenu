package com.materialdesign.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar_personal);
		setSupportActionBar(toolbar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//return super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {

		switch (item.getItemId()) {
			case R.id.menu_search: {
				Toast.makeText(this, "Seach menu item, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.menu_cart: {
				Toast.makeText(this, "Cart menu item, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.menu_profile: {
				Toast.makeText(this, "Profile menu item, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.menu_settings: {
				Toast.makeText(this, "Settings menu item, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.menu_about: {
				Toast.makeText(this, "About menu item=, selected", Toast.LENGTH_SHORT).show();
				break;
			}
		}

		return super.onOptionsItemSelected(item);
	}
}