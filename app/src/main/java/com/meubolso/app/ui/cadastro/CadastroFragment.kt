package com.meubolso.app.ui.cadastro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.meubolso.app.R
import com.meubolso.app.databinding.CadastroFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CadastroFragment : Fragment() {

    companion object {
        fun newInstance() = CadastroFragment()
    }

    private val navController by lazy {
        getNavControllerMain(requireActivity())
    }

    private val viewModel: CadastroViewModel by viewModel()
    private lateinit var binding: CadastroFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CadastroFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEntrarMembro.setOnClickListener {
            val action = CadastroFragmentDirections.actionCadastroFragmentToLoginFragment()
            navController.navigate(action)
        }

        binding.btnCadastrar.setOnClickListener {
            Toast.makeText(requireContext(),"Cadastrar Usuario: ${viewModel.emailInput.value}", Toast.LENGTH_SHORT).show()
        }

        binding.inputUsuarioNomeText.doOnTextChanged { inputText, _, _, _ ->
            viewModel.nomeCompletoInput.value = inputText.toString()
        }
        binding.inputUsuarioNumeroText.doOnTextChanged { inputText, _, _, _ ->
            viewModel.numeroInput.value = inputText.toString()
        }
        binding.inputUsuarioEmailText.doOnTextChanged { inputText, _, _, _ ->
            viewModel.emailInput.value = inputText.toString()
        }
        binding.inputUsuarioSenhaText.doOnTextChanged { inputText, _, _, _ ->
            viewModel.senhaInput.value = inputText.toString()
        }
    }

    private fun getNavControllerMain(activity: Activity): NavController {
        return Navigation.findNavController(activity, R.id.nav_host_fragment)
    }
}