package com.example.chris.omgandroid;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.SimpleCursorAdapter;


public class thisisatest extends ListActivity {


    @Override
    public long getSelectedItemId() {
        return super.getSelectedItemId();
    }

    @Override
    public int getSelectedItemPosition() {
        return super.getSelectedItemPosition();
    }

    ListView lv;
    Cursor cursorl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thisisatest);

        cursorl = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        startManagingCursor(cursorl);

        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};

        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleCursorAdapter listadapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursorl, from, to);

        setListAdapter(listadapter);

        lv = getListView();
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);



////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.menu_thisisatest, menu);
////        return true;
////    }
////
////    @Override
////    public boolean onOptionsItemSelected(MenuItem item) {
////        // Handle action bar item clicks here. The action bar will
////        // automatically handle clicks on the Home/Up button, so long
////        // as you specify a parent activity in AndroidManifest.xml.
////        int id = item.getItemId();
////
////        //noinspection SimplifiableIfStatement
////        if (id == R.id.action_settings) {
////            return true;
////        }
////
////        //noinspection SimplifiableIfStatement
////        if (id == R.id.New_Contact) {
////
////            Intent intent = new Intent(this, Make_a_contact.class);
////            startActivity(intent);
////
////            return true;
////        }
////        return super.onOptionsItemSelected(item);
////    }
//    ImageButton = (ImageButton) findViewById(R.id.ImageButton);
//    ImageButton.setOnClickListener(new View.OnClickListener() {
//
//        public void Show_Settings(View v){
////this is the settings button, whose onclick is identified in menu_thisisatest.xml
//
//            PopupMenu popup = new PopupMenu(thisisatest.this, ImageButton);
//
//            popup.getMenuInflater().inflate(R.menu.menu_thisisatest, popup.getMenu());
////            MenuInflater inflater = popup.getMenuInflater();
////            inflater.inflate(R.menu.menu_thisisatest, popup.getMenu());
//
//            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//
//                @Override
//                public boolean onMenuItemClick(MenuItem item) {
//        Toast.makeText(thisisatest.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();
////                    Intent intent = new Intent(thisisatest.this, Make_a_contact.class);
////                    startActivity(intent);
//                    return true;
//                }
//            });
////                @Override
////                public boolean onMenuItemClick(MenuItem item) {
////                    Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
////                    return true;
////                }
//            popup.show();
//        }});
//
//}

    }

    public void showPopUp (View view)

    {
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.popup_actions, popupMenu.getMenu());
        PopUpMenuEventHandle popUpMenuEventHandle = new PopUpMenuEventHandle(getApplicationContext());
        popupMenu.setOnMenuItemClickListener(popUpMenuEventHandle);
        popupMenu.show();
    }

}
