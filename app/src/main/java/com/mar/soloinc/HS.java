package com.mar.soloinc;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HS extends ListActivity {
    protected  void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listHS = new String[] {"Rumah Sakit Awal Bros", "RS EKA HOSPITAL",
                "RS SANTAMARIA","RS TABRANI" };
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listHS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        Object a = this.getListAdapter().getItem(position);
        String pilihan = a.toString();
        showoption(pilihan);
    }

    private void showoption(String pilihan) {

        try{
            Intent a = null;
            if(pilihan.equals("Rumah Sakit Awal Bros"))
            {
                a = new Intent(this, RSAwalbros.class);


            }else if (pilihan.equals("RS EKA HOSPITAL"))
            {

            }
            startActivity(a);
    } catch (Exception e) {
            e.printStackTrace();
        }
        }
}
