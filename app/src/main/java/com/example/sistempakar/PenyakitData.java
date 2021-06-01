package com.example.sistempakar;

import java.util.ArrayList;

public class PenyakitData {

    private static String [] penyakitName = {
            "Gastristis",
            "Dispepsia",
            "Kanker Lambung",
            "GERD",
            "Gastroenteritis",
            "Gastroparesis",
            "Tukak Lambung"
    };

    private static String [] keteranganPenyakit = {
            "Gastritis merupakan penyakit pada lambung yang terjadi akibat peradangan dinding lambung. Pada dinding lambung atau lapisan mukosa lambung ini terdapat kelenjar yang menghasilkan asam lambung dan enzim pencernaan yang bernama pepsin.",
            "Sindrom dispepsia adalah sekumpulan gejala yang dideskripsikan sebagai rasa tidak nyaman pada perut, seperti perut terasa penuh, kembung, sakit perut, dan nyeri ulu hati.",
            "Kanker lambung adalah suatu jenis tumor ganas yang tumbuh pada lambung, yaitu organ pencernaan berbentuk kantong di tengah rongga perut manusia.",
            "ni terjadi beberapa saat setelah kamu mengonsumsi makanan yang menjadi pemicunya. Naiknya asam lambung bisa menyebabkan peradangan pada saluran kerongkongan.",
            "Sebagian besar muntaber atau gastroenteritis disebabkan oleh infeksi virus. Ada dua jenis virus yang menjadi penyebab utama gastroenteritis, yaitu Norovirus dan Rotavirus.",
            "Penyebab gastroparesis belum diketahui dengan pasti, tetapi diduga disebabkan adanya kerusakan saraf yang mengatur gerakan otot lambung, yaitu saraf vagus.",
            "Sebagian besar kasus tukak lambung disebabkan oleh infeksi bakteri H. pylori atau karena konsumsi obat pereda nyeri yang berlebihan."
    };

    private static int[] gambarPenyakit = {
            R.drawable.penyakit,
            R.drawable.penyakit,
            R.drawable.penyakit,
            R.drawable.penyakit,
            R.drawable.penyakit,
            R.drawable.penyakit,
            R.drawable.penyakit
    };

    static ArrayList<Penyakit> getListData() {
        ArrayList<Penyakit> list = new ArrayList<>();
        for (int position = 0; position < penyakitName.length; position++) {
            Penyakit penyakit = new Penyakit();
            penyakit.setName(penyakitName[position]);
            penyakit.setKeterangan(keteranganPenyakit[position]);
            penyakit.setFoto(gambarPenyakit[position]);
            list.add(penyakit);
        }
        return list;
    }

}
