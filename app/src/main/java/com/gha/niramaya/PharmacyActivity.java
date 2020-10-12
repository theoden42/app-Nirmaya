package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class PharmacyActivity extends AppCompatActivity {

    RecyclerView rev;
    PharmacyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
        setTitle("Pharmacies:");

        rev = (RecyclerView) findViewById(R.id.recview);
        rev.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PharmacyAdapter(dataqueue());
        rev.setAdapter(adapter);
    }

    public ArrayList<PharmacyModel> dataqueue() {
        ArrayList<PharmacyModel> holder = new ArrayList<>();
        PharmacyModel ob1 = new PharmacyModel();
        ob1.setText1("Anurag Medical Store");
        ob1.setText2(" 099352 26074");
        ob1.setText3("208007, 36, PAC Rd, Netajinagar, Daheli Sujanpur, Kanpur");
        holder.add(ob1);

        PharmacyModel ob2 = new PharmacyModel();
        ob2.setText1("Sodhi Medical Store");
        ob2.setText2(" 086877 07923");
        ob2.setText3("Govind Nagar Railway Bridge, Govind Nagar Rd, Fazalganj");
        holder.add(ob2);

        PharmacyModel ob3 = new PharmacyModel();
        ob3.setText1("Prem Medical Store");
        ob3.setText2(" 089603 33245");
        ob3.setText3("345 G.S.V Nagar, Panki, Kanpur, Uttar Pradesh 208020");
        holder.add(ob3);

        PharmacyModel ob4 = new PharmacyModel();
        ob4.setText1("Rahul Chemist");
        ob4.setText2(" 094150 44219");
        ob4.setText3("Y Block, 128/983, Hamirpur Rd, Thana Naubasta, Kidwai Nagar");
        holder.add(ob4);

        PharmacyModel ob5 = new PharmacyModel();
        ob5.setText1("Amrit Medical Store");
        ob5.setText2(" 099351 55172");
        ob5.setText3(" 118/592 Kanpur-12, Kaushalpuri, Darshan Purwa, Kanpur");
        holder.add(ob5);

        PharmacyModel ob6 = new PharmacyModel();
        ob6.setText1("Ahuja Medical Stores");
        ob6.setText2("094150 40725");
        ob6.setText3("35 - 36, Chamanlal Market, Gumti No.5, Darshan Purwa, Kanpur");
        holder.add(ob6);

        PharmacyModel ob7 = new PharmacyModel();
        ob7.setText1("Kohli Medical Store");
        ob7.setText2(" 075658 86677");
        ob7.setText3("7/201 Opp. Hallet Hospital,, Swaroop Nagar, Kanpur");
        holder.add(ob7);

        PharmacyModel ob8 = new PharmacyModel();
        ob8.setText1("Meena Medical Store");
        ob8.setText2("8127661477");
        ob8.setText3("109, Hardinge Rd, Paradise Chouraha, Mirpur Cantonment, Mirpur");
        holder.add(ob8);

        PharmacyModel ob9 = new PharmacyModel();
        ob9.setText1("U P Medical Stores");
        ob9.setText2(" 0512 236 6610");
        ob9.setText3("38/103A, Mestan Road, Kanpur, Uttar Pradesh 208001");
        holder.add(ob9);

        PharmacyModel ob10 = new PharmacyModel();
        ob10.setText1("Jaisawal Medical Store");
        ob10.setText2(" 099360 55752");
        ob10.setText3("Western Sub Metropolitan Bypass Road, Sabji Mandi Road, Charari, Lal Bangla");
        holder.add(ob10);

        PharmacyModel ob11 = new PharmacyModel();
        ob11.setText1("Shah Medical Stores");
        ob11.setText2("099350 13137");
        ob11.setText3("38/161, Meston Rd, Shiwala, Bade Chouraha, Shiwala, Mulganj, Kanpur");
        holder.add(ob11);

        PharmacyModel ob12 = new PharmacyModel();
        ob12.setText1("Rajeev medical store");
        ob12.setText2(" 0512 304 0211");
        ob12.setText3("Motilal Swaroop Nagar, Khalasi Line, Arya Nagar, Kanpur");
        holder.add(ob12);

        PharmacyModel ob13 = new PharmacyModel();
        ob13.setText1("Anand Medical Store");
        ob13.setText2(" 0512 261 2490");
        ob13.setText3("100, Barra Main Rd, MIG, Barra 2, Barra World Bank, Barra, Kanpur");
        holder.add(ob13);

        PharmacyModel ob14 = new PharmacyModel();
        ob14.setText1("Gupta Medical Store");
        ob14.setText2(" 0512 211 9304");
        ob14.setText3("119/127, Bamba Rd, Kaushalpuri, Darshan Purwa, Kanpur");
        holder.add(ob14);
        PharmacyModel ob15 = new PharmacyModel();
        ob15.setText1("Pankaj Medical & General Stores");
        ob15.setText2(" 099356 67661");
        ob15.setText3("133/17, M Block, Kidwainagar Rd, Triveni Market, Kidwai Nagar");
        holder.add(ob15);
        PharmacyModel ob16 = new PharmacyModel();
        ob16.setText1("Jagat Medical Store");
        ob16.setText2("094515 45209");
        ob16.setText3("P.N420, Mangala Vihar 60 Feet Rd, Mangala Vihar- 1, Daheli Sujanpur, Kanpur");
        holder.add(ob16);
        PharmacyModel ob17 = new PharmacyModel();
        ob17.setText1("Singh Medical Store");
        ob17.setText2("  099186 02706");
        ob17.setText3("Hotel Krishna, 446A Jhansi-Kanpur Hwy Rama Devi, Shankar Nagar, Kanpur");
        holder.add(ob17);
        PharmacyModel ob18 = new PharmacyModel();
        ob18.setText1("Sunder Medical Stores");
        ob18.setText2(" 099366 00651");
        ob18.setText3("10, Anand Mahal, Harjinder, Kanpur, Uttar Pradesh 208007");
        holder.add(ob18);
        PharmacyModel ob19 = new PharmacyModel();
        ob19.setText1("Alok Medical Store");
        ob19.setText2(" 094508 84819");
        ob19.setText3(" 25-A, 20/500, Lajpat Nagar Rd, Near Kanpur Medical Centre, Lajpat Nagar,");
        holder.add(ob19);
        PharmacyModel ob20 = new PharmacyModel();
        ob20.setText1("Uttam Medical Store");
        ob20.setText2("090262 09173");
        ob20.setText3("3 k. r. puram, Sanigawan Rd, Daheli Sujanpur, Kanpur");
        holder.add(ob20);
        PharmacyModel ob21 = new PharmacyModel();
        ob21.setText1("Dinesh medical Store");
        ob21.setText2(" 090050 68012");
        ob21.setText3(" 92/1 Ompurwa Near Shri Praksh Jaiswal Lalbangla, Kanpur");
        holder.add(ob21);
        PharmacyModel ob22 = new PharmacyModel();
        ob22.setText1("Yadav Medical Store");
        ob22.setText2("090440 34370");
        ob22.setText3("Sanigawan Rd, Bhabha Nagar, Daheli Sujanpur, Kanpur");
        holder.add(ob22);
        PharmacyModel ob23 = new PharmacyModel();
        ob23.setText1("Lovely Medical & General Store");
        ob23.setText2("098388 85300");
        ob23.setText3("118/171, Krishna Nagar Rd, Kaushalpuri, Gumti No. 5, Kanpur");
        holder.add(ob23);
        PharmacyModel ob24 = new PharmacyModel();
        ob24.setText1("Kushwaha Medical Store");
        ob24.setText2(" 099563 11530");
        ob24.setText3("222,Saran State, Ahirwan ,, Kanpur, Uttar Pradesh 208007");
        holder.add(ob24);
        PharmacyModel ob25 = new PharmacyModel();
        ob25.setText1("Shobha Medical Store");
        ob25.setText2("098385 87552");
        ob25.setText3(" 7/142 D, Mata Swaruprani Rd, Kanpur Vidya Mandir, Khalasi Line, Swaroop Nagar, Kanpur");
        holder.add(ob25);
        PharmacyModel ob26 = new PharmacyModel();
        ob26.setText1("Ajay Medical Store");
        ob26.setText2("095981 80680");
        ob26.setText3("252A, Kanpur - Jhansi Hwy, Near Ahirava, Police Chowki, Ahirwan Market, Ahirwan, Kanpur");
        holder.add(ob26);
        PharmacyModel ob27 = new PharmacyModel();
        ob27.setText1("Shikha Medical Store");
        ob27.setText2(" 099355 00580");
        ob27.setText3("62/2, Kalyanpur - Vijay Nagar Rd, Galla Mandi, Vijay Nagar, Shastri Nagar, Kanpur");
        holder.add(ob27);

        PharmacyModel ob28 = new PharmacyModel();
        ob28.setText1("Naveen Medical Store");
        ob28.setText2(" 093356 89443");
        ob28.setText3("P.A.C Rd, Ram Puram, Shyam Nagar, Kanpur, Uttar Pradesh 208013");
        holder.add(ob28);
        PharmacyModel ob29 = new PharmacyModel();
        ob29.setText1("Kanpur Medical Store");
        ob29.setText2(" 074997 71577");
        ob29.setText3("CITY SPORTS, Shop No.44/317 Meston Road,Opp, Mulganj, Kanpur");
        holder.add(ob29);
        PharmacyModel ob30 = new PharmacyModel();
        ob30.setText1("Vansh Medical Store");
        ob30.setText2("099351 65503");
        ob30.setText3("220 Ahirwan G T Road Near ahirwa Police Chowki, Kanpur, Uttar Pradesh 208007");
        holder.add(ob30);
        PharmacyModel ob31 = new PharmacyModel();
        ob31.setText1("Quality Medical Store");
        ob31.setText2(" 094155 36079");
        ob31.setText3("/237,, 113, Mata Swaruprani Rd, Khalasi Line, Swaroop Nagar, Kanpur");
        holder.add(ob31);
        PharmacyModel ob32 = new PharmacyModel();
        ob32.setText1("Get Well Pharmacy");
        ob32.setText2(" 095068 38383");
        ob32.setText3("Star Press Building 96/02, next to Samsung Service Center, Chunniganj Chauraha, Kanpur");
        holder.add(ob32);

        return holder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pharmacy_menu, menu);
        MenuItem item = menu.findItem(R.id.pharmacy_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}