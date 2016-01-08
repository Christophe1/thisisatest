package com.example.chris.omgandroid;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

/**
 * Created by Chris on 07/01/2016.
 */
public class PopUpMenuEventHandle implements PopupMenu.OnMenuItemClickListener {
    Context context;
    public PopUpMenuEventHandle(Context context){
        this.context = context;
    }
    @Override
    public boolean onMenuItemClick(MenuItem item){

        if(item.getItemId()==R.id.id_Admin)
        {
            Toast.makeText(context, "LoginAdmin yeah!", Toast.LENGTH_LONG).show();
            return true;
        }

        else if(item.getItemId()==R.id.id_User){

            Toast.makeText(context, "LoginUser yeah!", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }

}
