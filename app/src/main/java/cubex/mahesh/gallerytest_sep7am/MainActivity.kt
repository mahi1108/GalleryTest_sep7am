package cubex.mahesh.gallerytest_sep7am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        readFiles()
    }

    fun  readFiles( )
    {
        var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Video/"
        var file = File(path)
        if(!file.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Video/"
            file = File(path)
        }
        var files = file.listFiles()
        gal.adapter = MyAdapter(files,this@MainActivity )
    }
}
