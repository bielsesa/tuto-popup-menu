package biel.edu.fje.popupmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.num1:
                Toast.makeText(this, "Número 1 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num2:
                Toast.makeText(this, "Número 2 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num3:
                Toast.makeText(this, "Número 3 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num4:
                Toast.makeText(this, "Número 4 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num5:
                Toast.makeText(this, "Número 5 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num6:
                Toast.makeText(this, "Número 6 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num7:
                Toast.makeText(this, "Número 7 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num8:
                Toast.makeText(this, "Número 8 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num9:
                Toast.makeText(this, "Número 9 seleccionat", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
