package com.example.navi.ui.activity.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navi.obj.ObjectCompanions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class IconFragment : Fragment() {
    private val TAG = "IconFragment"
    private var str1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            str1 = it.getString(ObjectCompanions.KEY)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG, "bundle value : $str1")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MusicButton()
                }
            }
        }

    }

    private val playIcon = 1
    private val loadingBar = 2
    private val pauseIcon = 3

    @Composable
    fun MusicButton(
        viewModel: MyViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
        context: Context = LocalContext.current.applicationContext
    ) {

        // Initially song is not loaded
        val songLoaded by viewModel.songLoaded.observeAsState(false)

        // This is used to remember the icon of the button
        // Its values are playIcon, loadingBar, and pauseIcon
        // Initially display the playIcon
        var buttonIcon by remember {
            mutableStateOf(playIcon)
        }

        OutlinedButton(
            modifier = Modifier
                .size(72.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(12.dp),
            elevation = ButtonDefaults.elevation(4.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color(0xFF35898F)
            ),
            border = BorderStroke(0.dp, Color.Transparent),
            onClick = {
                if (!songLoaded) {
                    // If song is NOT loaded

                    Toast.makeText(context, "Loading...", Toast.LENGTH_SHORT).show()

                    viewModel.loadTheSong()

                    // Assign buttonIcon to loadingBar so that progress indicator is displayed
                    buttonIcon = loadingBar
                } else {
                    // If the song is already loaded

                    if (buttonIcon == playIcon) {
                        // If the current icon is play Icon
                        // change it to pause icon
                        buttonIcon = pauseIcon
                    } else if (buttonIcon == pauseIcon) {
                        // If the current icon is pause icon
                        // change it to play icon
                        buttonIcon = playIcon
                    }
                }
            }
        ) {

            when (buttonIcon) {
                loadingBar -> {
                    if (songLoaded) {
                        // If the song is already loaded
                        // set the pause icon
                        buttonIcon = pauseIcon
                    } else {
                        // If the song is NOT loaded
                        // show the progress indicator
                        CircularProgressIndicator(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            color = Color.White
                        )
                    }
                }
                playIcon -> {
                    // Set the play icon
                    SetButtonIcon1(
                        icon = Icons.Filled.PlayArrow,
                        iconDescription = "Play Song"
                    )

                    // If the song is loaded, pause the actual song
                    if (songLoaded) {
                        pauseTheSong(context = context)
                    }
                }
                pauseIcon -> {
                    // Set the pause icon
                    SetButtonIcon1(Icons.Filled.Pause, iconDescription = "Pause Song")

                    // If the song is loaded, play the actual song
                    if (songLoaded) {
                        playTheSong(context = context)
                    }
                }
            }
        }

    }

    private fun playTheSong(context: Context) {
        // Here play the song
        Log.i("SemicolonSpace", "playTheSong()")
        Toast.makeText(context, "Playing....", Toast.LENGTH_SHORT).show()
    }

    private fun pauseTheSong(context: Context) {
        // Here pause the song
        Log.i("SemicolonSpace", "pauseTheSong")
        Toast.makeText(context, "Paused", Toast.LENGTH_SHORT).show()
    }

    @Composable
    private fun SetButtonIcon1(
        icon: ImageVector,
        iconDescription: String
    ) {
        Icon(
            modifier = Modifier
                .fillMaxSize(),
            imageVector = icon,
            contentDescription = iconDescription,
            tint = Color.White
        )
    }

    class MyViewModel : ViewModel() {

        // Music Button
        val songLoaded = MutableLiveData<Boolean>()

        fun loadTheSong() {

            viewModelScope.launch {

                withContext(Dispatchers.Default) {
                    // Perform background task  to get the song
                    // After the task is completed, call songLoadedSuccessful()
                    // Instead of background task, I'm setting 4 seconds delay
                    delay(4000)
                }
                songLoadedSuccessful()
            }
        }

        private fun songLoadedSuccessful() {
            songLoaded.value = true
        }
    }
}