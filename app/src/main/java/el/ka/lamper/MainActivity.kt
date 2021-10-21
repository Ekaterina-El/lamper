package el.ka.lamper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import el.ka.lamper.databinding.ActivityMainBinding
import el.ka.lamper.viewModel.ConvertorToBinaryVM
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ConvertorToBinaryVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater, null, false);
        setContentView(binding.root)

        viewModel = ConvertorToBinaryVM(application);
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }

}