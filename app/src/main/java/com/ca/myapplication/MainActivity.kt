package com.ca.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ca.myapplication.Fragment.CallsFragment
import com.ca.myapplication.Fragment.ChatsFragment
import com.ca.myapplication.Fragment.StatusFragment
import com.ca.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var fragment: Array<Fragment> = arrayOf(ChatsFragment(),StatusFragment(),CallsFragment())
    var title:Array<String> = arrayOf("Chats","Status","Calls")
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

        binding.vpFragment.adapter =FragmentAdapter(supportFragmentManager,fragment,title)
        binding.tabs.setupWithViewPager(binding.vpFragment)
        }
    }

