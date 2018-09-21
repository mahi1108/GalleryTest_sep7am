package cubex.mahesh.gallerytest_sep7am

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.indiview.view.*
import java.io.File

class MyAdapter(var files: Array<File>,
                var mainActivity: MainActivity) :BaseAdapter()
{
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inflater = LayoutInflater.from(mainActivity)
        var v = inflater.inflate(R.layout.indiview,null)
            var file = files[p0]
            v.vview.setVideoURI(Uri.fromFile(file))
            v.cb1.text = file.name
            v.cb1.setOnCheckedChangeListener { compoundButton, b ->
                if(b)
                        v.vview.start()
                else
                        v.vview.pause()
            }
        return v
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return files.size
    }

}