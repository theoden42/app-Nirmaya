package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class DoctorsActivity extends AppCompatActivity {

    RecyclerView rev;
    DoctorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        setTitle("Doctors in Kanpur:");

        rev = (RecyclerView) findViewById(R.id.recview);
        rev.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DoctorAdapter(dataqueue());
        rev.setAdapter(adapter);

    }

    public ArrayList<DoctorModel> dataqueue() {
        ArrayList<DoctorModel> holder = new ArrayList<>();
        DoctorModel ob1 = new DoctorModel();
        ob1.setText1("Dr. V .K Mishra");
        ob1.setText2(" 094150 40889");
        ob1.setText3("Shop No.13, Rajaram Market, Juhi Baradevi, Lal Palace, Juhi Kalan,, Juhi, Kanpur");
        holder.add(ob1);

        DoctorModel ob12 = new DoctorModel();
        ob12.setText1("Apollo Spectra Hospitals");
        ob12.setText2("84484 40991");
        ob12.setText3("14/138, Mall Rd, near B.N.S.D Inter College, Chunniganj Chauraha, Chunni Ganj, Permat, Kanpur");
        holder.add(ob12);

        DoctorModel ob13 = new DoctorModel();
        ob13.setText1("Dr.Gaurav Chawla");
        ob13.setText2("088743 04111");
        ob13.setText3("Lajpat Nagar Rd, Near JK Temple, Lajpat Nagar, Narainpurwa, Kanpur");
        holder.add(ob13);

        DoctorModel ob14 = new DoctorModel();
        ob14.setText1("Doctor Kiran Pandey");
        ob14.setText2(" 098390 91118");
        ob14.setText3(" 230, Arya Samaj Rd, Lal Bungalow, V.G. Market, Harinder Nagar Chauraha, Krishna Nagar, Kanpur");
        holder.add(ob14);
        DoctorModel ob15 = new DoctorModel();
        ob15.setText1("Dr Archana Trivedi");
        ob15.setText2(" 097601 57560");
        ob15.setText3("Regency Hospital Block -K, Govind Nagar Rd, Kanpur");
        holder.add(ob15);
        DoctorModel ob16 = new DoctorModel();
        ob16.setText1("Dr.A.K.Agarwal");
        ob16.setText2(" 070549 41300");
        ob16.setText3("64, 65, kanpur Road, Neelkanth Market, Rama Devi Chauraha, Kanpur");
        holder.add(ob16);
        DoctorModel ob17 = new DoctorModel();
        ob17.setText1("SANKAR KARTIK NETRALAYA");
        ob17.setText2(" 077030 06602");
        ob17.setText3("14/73, First Floor, Civil Lines, Near Merchant Chamber, Opposite dayanand Girls PG College, VIP Rd, Kanpur");
        holder.add(ob17);
        DoctorModel ob18 = new DoctorModel();
        ob18.setText1("Dr Sandeep K Mishra");
        ob18.setText2(" 09963066320");
        ob18.setText3("7/159-A, Model Bakery Road Landmark: Near Little Folks School & Arya Nagar Kamal Chauraha");
        holder.add(ob18);
        DoctorModel ob19 = new DoctorModel();
        ob19.setText1("Dr.Nigam's Clinic");
        ob19.setText2("093362 11413");
        ob19.setText3("186 M, Kidwai Nagar, Kanpur");
        holder.add(ob19);
        DoctorModel ob20 = new DoctorModel();
        ob20.setText1("Dr. Anand Nigam");
        ob20.setText2(" 080522 90321");
        ob20.setText3("4, Jaiswal market, Lal Bangla, J K Puri, Kanpur");
        holder.add(ob20);
        DoctorModel ob21 = new DoctorModel();
        ob21.setText1("Madhuraj Hospital Private Limited");
        ob21.setText2(" 1800 120 8700");
        ob21.setText3("113/121-A, Motilal Swaroop Nagar, Khalasi Line, Swaroop Nagar, Kanpur");
        holder.add(ob21);
        DoctorModel ob22 = new DoctorModel();
        ob22.setText1("JAIN HOSPITAL");
        ob22.setText2("090440 34370");
        ob22.setText3("Ramadevi 108 B, Gandhi Gram, Kanpur");
        holder.add(ob22);
        DoctorModel ob23 = new DoctorModel();
        ob23.setText1("Kanpur Medical Centre Private Limited");
        ob23.setText2(" 0512 229 5152");
        ob23.setText3("120/500(24, Govind Nagar Rd, near J.K. Temple, Lajpat Nagar, Narainpurwa, Kanpur, Uttar Pradesh 208005");
        holder.add(ob23);
        DoctorModel ob24 = new DoctorModel();
        ob24.setText1("Dr Abhinit Gupta");
        ob24.setText2(" 099688 57048");
        ob24.setText3("Interventional Cardiologist, Regency Hospital Ltd., A-2, Sarvodaya Nagar, Kanpur");
        holder.add(ob24);
        DoctorModel ob25 = new DoctorModel();
        ob25.setText1("Dr. Rajan Bhargava ENT Clinic");
        ob25.setText2(" 097940 17490");
        ob25.setText3("111/218, apposite gate of A.N.D. college, Chandra Gupta Rd, Harsh Nagar, Kanpur, Uttar Pradesh 208021");
        holder.add(ob25);
        DoctorModel ob26 = new DoctorModel();
        ob26.setText1("DR. MOHD SUHEL");
        ob26.setText2(" 098390 09591");
        ob26.setText3("105/37, - A PREM NAGAR, Kanpur");
        holder.add(ob26);
        DoctorModel ob27 = new DoctorModel();
        ob27.setText1("Dr. Brijendra Singh");
        ob27.setText2(" 093693 25942");
        ob27.setText3("103-A, Anand Tower, Moti Vihar Society, Sarvodaya Nagar, Kanpur");
        holder.add(ob27);

        DoctorModel ob28 = new DoctorModel();
        ob28.setText1("Dr A S Prasad Clinic");
        ob28.setText2(" 098390 34961");
        ob28.setText3("37, 208002, Kanpur Road, Friends Colony, Swaroop Nagar");
        holder.add(ob28);
        DoctorModel ob29 = new DoctorModel();
        ob29.setText1("Dr Pragati Gogia Jain");
        ob29.setText2(" 094518 70039");
        ob29.setText3("Defcon Medicentre, C - 37, near Angel Eyes Hospital, Sarvodaya Nagar, Kanpur");
        holder.add(ob29);
        DoctorModel ob30 = new DoctorModel();
        ob30.setText1("Dr.Anil Jain");
        ob30.setText2("093696 22226");
        ob30.setText3("Jeet, 113/22, in front of shahi darbar apptt. Indra, Indrajeet Jain Marg, Swaroop Nagar, Kanpur");
        holder.add(ob30);
        DoctorModel ob31 = new DoctorModel();
        ob31.setText1("Dr Agarwal Skin and Laser Centre");
        ob31.setText2(" 0512 254 3944");
        ob31.setText3("Prem Ratan Vatika Apts, 7/180, Swaroop Nagar, Kanpur, Uttar Pradesh 208002");
        holder.add(ob31);
        DoctorModel ob32 = new DoctorModel();
        ob32.setText1("Dr. Mohd Jameel");
        ob32.setText2(" 0512 233 0405");
        ob32.setText3("LG-37, Som Dutt Plaza, Navin Market Ln, Civil Lines, Kanpur");
        holder.add(ob32);
        DoctorModel ob33 = new DoctorModel();
        ob33.setText1("Dr. Ajmal Hasan");
        ob33.setText2(" 094505 55724");
        ob33.setText3("Regency Hospital Limited, A-2, Cecil Clementi St, Model Town, Sarvodaya Nagar, Kanpur");
        holder.add(ob33);
        DoctorModel ob34 = new DoctorModel();
        ob34.setText1("DR. YUTHIKA BAJPAI");
        ob34.setText2(" 0512 308 1337");
        ob34.setText3(" A-2, Cecil Clementi St, Cecil Clementi Street, Near R.T.O. Office, Model Town, Sarvodaya Nagar, Kanpur");
        holder.add(ob34);
        DoctorModel ob35 = new DoctorModel();
        ob35.setText1("Dr. Deepak Kumar");
        ob35.setText2(" 098390 37525");
        ob35.setText3("19, Marjampur Road, Near J.K. Temple, Shivaji Nagar, Sarvodaya Nagar, Kanpur");
        holder.add(ob35);
        DoctorModel ob36 = new DoctorModel();
        ob36.setText1("Dr. Rajeev Kainth Clinic");
        ob36.setText2(" 093362 36611");
        ob36.setText3("Opposite Hallet Hospital 7/204, Mall Road Opposite Hallet Hospital, Swaroop Nagar, Sarvodaya Nagar, Kanpur");
        holder.add(ob36);
        DoctorModel ob37 = new DoctorModel();
        ob37.setText1("Skin Clinic Dr P S Bhatia");
        ob37.setText2(" 099199 82549");
        ob37.setText3("208006, 5-8, Govind Nagar Rd, B Block, Govind Nagar, Kanpur\n");
        holder.add(ob37);
        DoctorModel ob38 = new DoctorModel();
        ob38.setText1("Dr. Sushma Singh And Dr. S.P. Singh");
        ob38.setText2(" 0512 265 1706");
        ob38.setText3("C-247, C Block, Govind Nagar Road Near Govindpuri Railway Station, Govind Nagar, Kanpur");
        holder.add(ob38);
        DoctorModel ob39 = new DoctorModel();
        ob39.setText1("Dr Archana Trivedi ");
        ob39.setText2(" 097601 57560");
        ob39.setText3("117Q/68, Sharda Nagar, Kanpur, Uttar Pradesh 208024\n");
        holder.add(ob39);
        DoctorModel ob40 = new DoctorModel();
        ob40.setText1("Dr. A.K Misra");
        ob40.setText2(" 0512 260 6020");
        ob40.setText3("Shop No. 127/395, S Block, Juhi Depo, Vinoba Nagar, Kanpur");
        holder.add(ob40);
        DoctorModel ob41 = new DoctorModel();
        ob41.setText1("Dr. Ashwani Kumar Uttam Neurologist");
        ob41.setText2(" 098385 65627");
        ob41.setText3("Sai Clinic, Flat No.101, Sai Samraddhi Apartment, 117/M/1091, near Namak Factory Chauraha, Kakadeo, Kanpur");
        holder.add(ob41);
        DoctorModel ob42 = new DoctorModel();
        ob42.setText1("Dr. Madhukar Vashistha (ENT Specialist)");
        ob42.setText2("070076 90118");
        ob42.setText3("OJ ENT care, Bithoor Rd, Kalyanpur, Kanpur, Uttar Pradesh 208017");
        holder.add(ob42);
        DoctorModel ob43 = new DoctorModel();
        ob43.setText1("New G.T. Nursing Home");
        ob43.setText2(" 0512 253 1815");
        ob43.setText3(" 7/223, Gutaiya, Swaroop Nagar, G T Road, Kanpur, Uttar Pradesh 208002");
        holder.add(ob43);
        DoctorModel ob44 = new DoctorModel();
        ob44.setText1("Shifa Eye Research Center");
        ob44.setText2(" 0512 254 2208");
        ob44.setText3("Nala Rd, Chaman Ganj, Colonelganj, Kanpur, Uttar Pradesh 208001");
        holder.add(ob44);

        DoctorModel ob45 = new DoctorModel();
        ob45.setText1("Dr. Kabir Singh");
        ob45.setText2(" preeti se puch lena");
        ob45.setText3("preeti ke saath");
        holder.add(ob45);



        return holder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.doctors_menu, menu);
        MenuItem item = menu.findItem(R.id.doctor_search);
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