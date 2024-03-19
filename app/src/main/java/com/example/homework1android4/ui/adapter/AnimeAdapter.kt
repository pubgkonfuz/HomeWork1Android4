package com.example.homework1android4.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework1android4.databinding.ItemAnimeBinding
import com.example.homework1android4.data.model.Anime


class AnimeAdapter : ListAdapter<Anime, AnimeAdapter.AnimeViewHolder>(animeDiffUtil) {

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) : ViewHolder(binding.root) {
        fun onBind(item: Anime) = with(binding) {
            textItem.text = item.name
            ivItem.setImageResource(item.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val animeDiffUtil = object : DiffUtil.ItemCallback<Anime>() {
            override fun areItemsTheSame(oldItem: Anime, newItem: Anime): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Anime, newItem: Anime): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }
}