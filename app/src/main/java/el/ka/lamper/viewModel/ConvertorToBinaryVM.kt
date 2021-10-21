package el.ka.lamper.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ConvertorToBinaryVM(application: Application): AndroidViewModel(application) {
    companion object {
        const val minUserValue = 0
        const val maxUserValue = 8
        const val defaultUserValue = 0
    }

    private var _userValue = MutableLiveData<Int>(defaultUserValue)
    val userValue: LiveData<Int> get() = _userValue

    fun setNewUserValue(newUserValue: Int) {
        if (newUserValue in minUserValue until maxUserValue + 1) {
            _userValue.value = newUserValue
        }
    }
}