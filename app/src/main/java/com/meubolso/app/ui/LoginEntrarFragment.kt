package com.meubolso.app.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meubolso.app.R

class LoginEntrarFragment : Fragment() {

    companion object {
        fun newInstance() = LoginEntrarFragment()
    }

    private lateinit var viewModel: LoginEntrarViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_entrar_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginEntrarViewModel::class.java)
        // TODO: Use the ViewModel
    }

}