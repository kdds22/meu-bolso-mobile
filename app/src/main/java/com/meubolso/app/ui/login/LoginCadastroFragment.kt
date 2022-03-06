package com.meubolso.app.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meubolso.app.R

class LoginCadastroFragment : Fragment() {

    companion object {
        fun newInstance() = LoginCadastroFragment()
    }

    private lateinit var viewModel: LoginCadastroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_cadastro_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginCadastroViewModel::class.java)
        // TODO: Use the ViewModel
    }

}