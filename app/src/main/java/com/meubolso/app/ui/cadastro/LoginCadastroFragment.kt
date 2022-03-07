package com.meubolso.app.ui.cadastro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.meubolso.app.databinding.LoginCadastroFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginCadastroFragment : Fragment() {

    companion object {
        fun newInstance() = LoginCadastroFragment()
    }

    private val viewModel: LoginCadastroViewModel by viewModel()
    private lateinit var binding: LoginCadastroFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginCadastroFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}