package work.on.movableviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        three!!.setOnClickListener {
            if (three!!.text.equals("Show")){
                three!!.text = "Hide"
                one!!.visibility = View.VISIBLE
                two!!.visibility = View.VISIBLE
            }
            else{
                three!!.text = "Show"
                one!!.visibility = View.GONE
                two!!.visibility = View.GONE
            }
        }
    }
}
