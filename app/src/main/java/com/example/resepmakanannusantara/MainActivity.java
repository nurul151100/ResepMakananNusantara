package com.example.resepmakanannusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan,namaMakanan,infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Resep masakan nusantara Soto Padang");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4759/ilustrasi-soto-padang.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 500 gram daging sapi (campur dengan tulang).\n" +
                "- 2 liter air.\n" +
                "- minyak goreng secukupnya.\n" +
                "\n" +
                "Bahan cemplung :\n" +
                "\n" +
                "- 4 lembar daun jeruk.\n" +
                "- 3 lembar daun salam.\n" +
                "- 8 kelopak bunga lawang.\n" +
                "- 2 batang sereh digeprek.\n" +
                "- 2 batang daun bawang diiris.\n" +
                "- 5 buah kapulaga.\n" +
                "- 5 buah cengkeh.\n" +
                "- 4 cm kayu manis.\n" +
                "\n" +
                "Bumbu halus :\n" +
                "\n" +
                "- 6 buah bawang merah.\n" +
                "- 10 siung bawang putih.\n" +
                "- 1 ruas kunyi.\n" +
                "- 3 ruas lengkuas.\n" +
                "- 2 ruas jahe.\n" +
                "- 1 sdt pala bubuk.\n" +
                "- 2 sdt lada bubuk.\n" +
                "- 1 sdm ketumbar bubuk.\n" +
                "- garam.\n" +
                "\n" +
                "Bumbu pelengkap :\n" +
                "\n" +
                "- sohun siram dengan air panas, rendam sebentar, angkat dan tiriskan.\n" +
                "- perkedel kentang.\n" +
                "- kerupuk merah.\n" +
                "- kecap.\n" +
                "- cuka.\n" +
                "- sambal.\n" +
                "- seledri diiris halus.\n" +
                "- bawang goreng.\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "a. Rebus daging sampai mendidih keluar buihnya, buah buih yang mengapung, masukkan semua bahan cemplung, lanjutkan merebus sampai daging empuk, masukan daun bawang, tunggu layu, matikan kompor, angkat daging, dan tunggu dingin.\n" +
                "b. Panaskan minyak goreng, tumis bumbu halus sampai wangi, campur bumbu yang sudah ditumis ke dalam air rebusan daging, masak sebentar sampai bumbu dan kaldu menyatu. koreksi rasa.\n" +
                "c. Iris tipis daging yang sudah direbus, kemudian goreng sampai garing.\n" +
                "d. Tata sohun, daging didalam mangkok, siram dengan kuah soto, beri kerupuk, perkedel, seledri dan sambal.\n" +
                "e. Sajikan.");

        namaMakanan.add("Resep Bubur Manado");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4856/ilustrasi-bubur-manado.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 500 gram daging sapi (campur dengan tulang).\n" +
                "- 2 liter air.\n" +
                "- minyak goreng secukupnya.\n" +
                "\n" +
                "Bahan cemplung :\n" +
                "\n" +
                "- 4 lembar daun jeruk.\n" +
                "- 3 lembar daun salam.\n" +
                "- 8 kelopak bunga lawang.\n" +
                "- 2 batang sereh digeprek.\n" +
                "- 2 batang daun bawang diiris.\n" +
                "- 5 buah kapulaga.\n" +
                "- 5 buah cengkeh.\n" +
                "- 4 cm kayu manis.\n" +
                "\n" +
                "Bumbu halus :\n" +
                "\n" +
                "- 6 buah bawang merah.\n" +
                "- 10 siung bawang putih.\n" +
                "- 1 ruas kunyi.\n" +
                "- 3 ruas lengkuas.\n" +
                "- 2 ruas jahe.\n" +
                "- 1 sdt pala bubuk.\n" +
                "- 2 sdt lada bubuk.\n" +
                "- 1 sdm ketumbar bubuk.\n" +
                "- garam.\n" +
                "\n" +
                "Bumbu pelengkap :\n" +
                "\n" +
                "- sohun siram dengan air panas, rendam sebentar, angkat dan tiriskan.\n" +
                "- perkedel kentang.\n" +
                "- kerupuk merah.\n" +
                "- kecap.\n" +
                "- cuka.\n" +
                "- sambal.\n" +
                "- seledri diiris halus.\n" +
                "- bawang goreng.\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "a. Rebus daging sampai mendidih keluar buihnya, buah buih yang mengapung, masukkan semua bahan cemplung, lanjutkan merebus sampai daging empuk, masukan daun bawang, tunggu layu, matikan kompor, angkat daging, dan tunggu dingin.\n" +
                "b. Panaskan minyak goreng, tumis bumbu halus sampai wangi, campur bumbu yang sudah ditumis ke dalam air rebusan daging, masak sebentar sampai bumbu dan kaldu menyatu. koreksi rasa.\n" +
                "c. Iris tipis daging yang sudah direbus, kemudian goreng sampai garing.\n" +
                "d. Tata sohun, daging didalam mangkok, siram dengan kuah soto, beri kerupuk, perkedel, seledri dan sambal.\n" +
                "e. Sajikan.");

        namaMakanan.add("Resep Sop Konro Makassar");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4857/ilustrasi-sop-konro-.jpg");
        infoMakanan.add("Bahan :\n" +
                "\n" +
                "- 1 kg iga sapi.\n" +
                "- 1 lembar daun salam.\n" +
                "- 2 lembar daun jeruk.\n" +
                "- 1/2 butir kelapa parut kemudian disangrai hingga kering lalu dihaluskan.\n" +
                "- 2 cm kayu manis.\n" +
                "- 1700 ml air.\n" +
                "- Daun bawang dan Daun Seledri secukupnya.\n" +
                "- Minyak secukupnya.\n" +
                "- Gula pasir,garam,kaldu sapi bubuk secukupnya.\n" +
                "\n" +
                "Bumbu halus :\n" +
                "\n" +
                "- 6 siung bawang putih.\n" +
                "- 10 siung bawang merah.\n" +
                "- 2 cm kunyit.\n" +
                "- 4 butir kemiri.\n" +
                "- 1 buah kluwak.\n" +
                "- 5 batang sereh.\n" +
                "- Serimpang lengkuas.\n" +
                "- 1 sdt ketumbar bubuk.\n" +
                "- 1/4 pala bubuk.\n" +
                "- 1/2 sdt merica bubuk.\n" +
                "- 1 sdt jinten bubuk.\n" +
                "\n" +
                "\n" +
                "Bahan pelengkap :\n" +
                "\n" +
                "- Nasi putih atau buras.\n" +
                "- Bawang goreng.\n" +
                "- Sambel & jeruk nipis.\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "a. Presto iga sapi hingga empuk dengan air secukupnya,saring ambil kaldunya 1 liter.\n" +
                "b. Pindahkan kepanci biasa,masukan iga dan kaldunya lalu tambah air biasa 700 ml atau secukupnya.\n" +
                "c. Tumis bumbu halus dengan minyak secukupnya hingga wangi,lalu masukan kedalam panci iga,masukan juga daun salam,daun jeruk,kayu manis dan kelapa sangrai yang dihaluskan,aduk rata,beri gula garam dan kaldu sapi bubuk,didihkan cek rasa.\n" +
                "d. Masukan potongan daun seledri dan daun bawang secukupnya didihkan sebentar matikan api.\n" +
                "e. Sajikan dimangkok saji lalu taburi bawang goreng.");

        namaMakanan.add("Resep Sate Lilit Khas Bali");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4766/ilustrasi-sate-lilit.jpg");
        infoMakanan.add("Bahan :\n" +
                "\n" +
                "- 100 gr kelapa parut.\n" +
                "- 300 gr daging ayam (giling).\n" +
                "- 1 butir telur ayam.\n" +
                "- 2 sdm tapioka.\n" +
                "- 4 siung bawang putih.\n" +
                "- 5 siung bawang merah.\n" +
                "- 3 biji kemiri (sangrai).\n" +
                "- 1 cm lengkuas.\n" +
                "- 1 cm jahe.\n" +
                "- 1 cm kunyit (bakar).\n" +
                "- 2 cm kencur.\n" +
                "- 1 cm terasi (bakar).\n" +
                "- 20 batang bambu atau serai.\n" +
                "- 5 buah cabe rawit (boleh lebih).\n" +
                "- garam & merica secukupnya .\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "a. Haluskan bawang merah,bawang putih, kunyit, cabai, kemiri, jahe, kencur, lengkuas dan terasi\n" +
                "b. Campurkan ayam giling,telur,tapioka,dan kelapa. Beri garam dan merica secukupnya.\n" +
                "c. Tumis bumbu halus hingga harum lalu campurkan kedalam adonan daging ayam. Aduk rata.\n" +
                "d. Panaskan Grill Pan dengan api sedang. Ambil sedikit adonan. Masak hingga matang. Lalu cicipi rasanya hingga pas.\n" +
                "e. Jika rasa sudah pas. Ambil adonan secukupnya dan lilitkan pada batang Bambu atau Batang serai. Lalu panggang di Grill Pan hingga matang.\n" +
                "f. Untuk Sambal matah : iris bawang merah,daun jeruk,cabai,dan batang serai bagian putihnya saja. Beri sejumput garam. panaskan 2 sdm minyak masukkan terasi. goreng hingga terasi hancur bercampur minyak. lalu campurkan pada bahan irisan. Aduk rata, siap dihidangkan.");

        namaMakanan.add("Resep Candil Ketan");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4860/ilustrasi-pempek.jpg");
        infoMakanan.add("Bahan :\n" +
                "\n" +
                "- 30 gr tepung tapioka.\n" +
                "- 200 gr tepung ketan.\n" +
                "- 1/3 sdt garam.\n" +
                "- air hangat secukupnya.\n" +
                "\n" +
                "Bahan kuah :\n" +
                "\n" +
                "- 800 ml air.\n" +
                "- 150 gula merah, disisir.\n" +
                "- 2 lembar daun pandan ditali simpul.\n" +
                "\n" +
                "Bahan larutan pengental :\n" +
                "\n" +
                "- 1 sdm tepung beras atau boleh lebih jika suka kuah yang kental.\n" +
                "- 1 sdm tepung ketan atau boleh lebih jika suka kuah yang kental.\n" +
                "- Campur semua bahan dan tambahkan sedikit air, aduk hingga larut dan tidak ada yang bergerindil.\n" +
                "\n" +
                "Bahan kuah santan :\n" +
                "\n" +
                "- 1/4 sdt garam.\n" +
                "- 400 ml santan kental.\n" +
                "- buah nangka Secukupnya.\n" +
                "\n" +
                "Rebus kuah santan hingga mendidih bersama garam dan daun pandan. Matikan api. Masukan potongan nangka.\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "a. Campur tepung ketan, tepung tapioka dan garam, tuangi air hangat secukupnya sampai adonan lembut dan enak buat dipulung ( kalau terlalu lembek boleh ditambahi tepung ketan lagi).\n" +
                "b. Siapkan nampan, taburi tipis2 dengan tepung kanji.\n" +
                "c. Ambil secuil adonan bentuk bulat sebesar kelereng. Susun di atas nampan. Lakukan sampai adonan habis\n" +
                "d. Masak semua bahan kuah kuah gula merah hingga gula larut dan mendidih.\n" +
                "e. Saring lalu masak lagi sampai mendidih.\n" +
                "f. Masukkan bola bola ketan. Masak dengan api kecil hingga gula meresap dan warna bola bola ketan berubah kecoklatan.\n" +
                "g. Masukkan larutan tepung , aduk pelan sampai kental dan meletup2.\n" +
                "h. Jika kurang kental bisa ditambahkan tepung ketan/ tepung beras yang dicairkan lalu dimasak lagi sampai kental.\n" +
                "i. Sajikan dengan kuah santan.");

        namaMakanan.add("Resep Seblak Bandung");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4861/ilustrasi-seblak-bandung.jpg");
        infoMakanan.add("Bahan:\n" +
                "\n" +
                "- 6 butir bakso.\n" +
                "- 200 g ceker.\n" +
                "- 2 genggam kerupuk (redam di air biasa 2 jam).\n" +
                "\n" +
                "Bumbu halus:\n" +
                "\n" +
                "- 3 siung bawang putih.\n" +
                "- 4 siung bawang merah.\n" +
                "- 3 butir kemiri.\n" +
                "- 1 ruas jari kencur.\n" +
                "- 6 cabe rawit pedas.\n" +
                "- 8 cabe merah keriting.\n" +
                "- 5 cabe rawit hijau (untuk irisan).\n" +
                "- 1 bonggol sawi sendok.\n" +
                "- 1 batang daun bawang.\n" +
                "- Air kaldu rebusan ceker (sesuai selera).\n" +
                "- 2 butir telur yang sudah di orak arik.\n" +
                "- Gula, garam, kaldu bubuk, lada bubuk secukupnya.\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "a. Tumis bumbu hingga matang.\n" +
                "b. Tambahkan bakso, ceker, kerupuk yg sudah di rendam, garam, gula, lada, saus tiram, kaldu bubuk. Masak sebentar.\n" +
                "c. Tambah air kaldu, masak hingga mendidih.\n" +
                "d. Masukkan daun sawi, daun bawang, dan cabe rawit iris, masak hingga sayuran matang.");

        namaMakanan.add("Resep Batagor Bandung");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4862/ilustrasu-batagor.jpg");
        infoMakanan.add("Bahan:\n" +
                "\n" +
                "- 250 gr ikan fillet tenggiri buang kulitnya\n" +
                "- 2 butir telur (jika besar boleh pakai 1 butir)\n" +
                "- 1/2 sdt meres garam\n" +
                "- 1 sdt gula putih\n" +
                "- 1/2 sdt lada putih bubuk (optional)\n" +
                "- 5 sdm tepung tapioka/sagu\n" +
                "- 2 sdm tepung terigu\n" +
                "- 4 buah bawang putih potong goreng\n" +
                "- 5 buah tahu pong segi4 bagi 2\n" +
                "- 1 lembar daun bawang iris tipis\n" +
                "- 15 lembar kulit pangsit\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "1. Masukan seluruh bahan kedalam chopper, blender hingga halus, koreksi rasa.\n" +
                "2. Campurkan irisan daun bawang, aduk hingga rata.\n" +
                "3. Isi tahu dengan 1 sdm adonan, isi kulit pangsit dengan 1sdt adonan, Goreng dalam api sedang hingga kecoklatan.\n" +
                "\n" +
                "Sambal Batagor\n" +
                "\n" +
                "- 100 gr kacang tanah\n" +
                "- 6 buah cabai rawit merah\n" +
                "- 6 buah cabai merah keriting\n" +
                "- 3 buah bawang putih\n" +
                "- 100 cc air putih\n" +
                "- 1 sdm gula merah\n" +
                "- 1/2 sdt garam\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "1. Goreng seluruh bahan.\n" +
                "2. Blender dengan air, garam, gula.\n" +
                "3. Siapkan sedikit minyak, masak dalam api kecil hingga mengeluarkan minyak.");

        namaMakanan.add("Resep Tahu tek Surabaya");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2020/01/02/4863/ilustrasi-tahu-tek.jpg");
        infoMakanan.add("Bahan :\n" +
                "\n" +
                "- 2 Telor\n" +
                "- Tahu putih\n" +
                "- 100 gr genggam kacang tanah goreng\n" +
                "- 4 siung bawang putih\n" +
                "- Garam dan lada secukupnya.\n" +
                "- Cabe rawit jika suka pedas\n" +
                "- 1-2 sdm kecap manis\n" +
                "- 1/2 sdm petis udang\n" +
                "- Daun seledri iris tipis2\n" +
                "- Kerupuk bawang yg biasanya juga untuk gado2\n" +
                "- 2 genggam Toge rebus\n" +
                "- Lontong atau nasi\n" +
                "\n" +
                "Cara memasak :\n" +
                "\n" +
                "-Bumbu/saus kacang\n" +
                "a. Goreng kacang tanah hingga matang, boleh digoreng bersama bawang putih dan cabe rawit, sisihkan.\n" +
                "b. Jika sudah dingin blender semuanya ditambah air matang agar blender tidak berat jalannya.\n" +
                "c. Tuang di mangkok, tambahkan gula, garam, kecap manis, dan petis udang.\n" +
                "d. Aduk rata. Boleh ditambah kecap sampai dapat rasa dan warna saus yg diinginkan.\n" +
                "\n" +
                "-Tahu telor:\n" +
                "a. Kocok lepas telor.\n" +
                "b. Masukkan tahu yg sdh diiris kotak2 kecil tambahkan garam, lada, dan sedikit kaldu bubuk.\n" +
                "c. Goreng dengan wajan cekung dengan minyak yang panas dan api cenderung. kecil agar tahu matang sempurna.\n" +
                "\n" +
                "-Plating:\n" +
                "a. Iris lontong/nasi tata d piring, letakkan tahu telornya.\n" +
                "b. Siram sausnya.\n" +
                "c. Tambahkan toge dan terakhir irisan daun seledrinya.\n" +
                "d. Tambahkan timun jika suka Jangan lupa kerupuknya.\n" +
                "e. Sajikan selagi hangat.");

        namaMakanan.add("Resep Rawon Khas Jawa Timur");
        fotoMakanan.add("https://cdns.klimg.com/diadona.id/resources//real/2019/12/28/2399/ilustrasi-rawon-setan-surabaya.jpg");
        infoMakanan.add("Bahan:\n" +
                "\n" +
                "- 500 gram daging sapi, bagian sandung lumur\n" +
                "- 1.500 ml air kaldu sapi\n" +
                "- 3 sdm minyak goreng, untuk menumis\n" +
                "- 1 sdm garam\n" +
                "\n" +
                "Haluskan:\n" +
                "\n" +
                "- 6 siung bawang putih\n" +
                "- 4 biji keluak (ambil isinya, lalu rendam dalam air)\n" +
                "- 5 lembar daun jeruk purut\n" +
                "- 8 buah cabai merah\n" +
                "- 2 ibu jari lengkuas\n" +
                "- 2 cm jahe\n" +
                "- 3 cm kunyit\n" +
                "- 2 cm kencur\n" +
                "- 1/4 sdt jintan\n" +
                "- 2 sdm ketumbar\n" +
                "- 1/2 sdt merica butir\n" +
                "- 4 lembar daun salam\n" +
                "- 2 batang serai, memarkan\n" +
                "- 2 mata asam jawa, larutkan dengan 1 sdm air\n" +
                "\n" +
                "Pelengkap:\n" +
                "\n" +
                "- Sambal terasi\n" +
                "- Kerupuk ikan\n" +
                "- Tauge pendek/kecambah\n" +
                "- Telur bebek asin\n" +
                "\n" +
                "Cara memasak :\n" +
                "a. Cuci daging sampai bersih, rebus sampai matang. Angkat dan tiriskan daging, lalu potong ukuran dadu. Sisihkan daging dan air kaldunya.\n" +
                "b. Panaskan minyak, tumis bumbu halus sampai harum dan matang. Masukkan daging, serai, daun jeruk, air asam, dan garam. Aduk sampai rata dan beraroma.\n" +
                "c. Pukul-pukul daging sampai melebar. Goreng dalam minyak panas sebentar, angkat. Taburi dengan bawang goreng");

        prosesRecyclerViewAdapter();
    }

}
