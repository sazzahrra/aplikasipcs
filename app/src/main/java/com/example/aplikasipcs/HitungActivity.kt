package com.example.aplikasipcs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HitungActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        //deklarasi variabel dan inisialisasi view
        val mEditTextBilanganPertama = findViewById<EditText>(R.id.et_bilangan_pertama)
        val mEditTextBilanganKedua = findViewById<EditText>(R.id.et_bilangan_kedua)
        val mButtonHitung = findViewById<Button>(R.id.btn_hitung)
        val mTextViewHasil = findViewById<TextView>(R.id.tv_hasil)

        //click listener pada button
        mButtonHitung.setOnClickListener {
            //validasi nilai dari EditText
            if (mEditTextBilanganPertama.text.toString() == "") {
                mEditTextBilanganPertama.error = "Kamu Belum Memasukkan Bilangan Pertama"
                return@setOnClickListener
            }

            if (mEditTextBilanganKedua.text.toString() == "") {
                mEditTextBilanganKedua.error = "Kamu Belum Memasukkan Bilangan Kedua"
                return@setOnClickListener
            }


        }

        //Mengambil nilai dari EditText dan mengubahnya ke tipe data double
        val mBilanganPertama = mEditTextBilanganPertama.text.toString().toDouble()
        val mBilanganKedua = mEditTextBilanganKedua.text.toString().toDouble()


        //melakukan inisialisasi dengan nilai awal 0.0
        var mHasilPerhitungan = mBilanganPertama * mBilanganKedua



        //Mengubah nilai dari double menjadi string dan menampilkannya ke widget TextView
        mTextViewHasil.text = mHasilPerhitungan.toString()

    }

}