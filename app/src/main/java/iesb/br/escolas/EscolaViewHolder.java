package iesb.br.escolas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



class EscolaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView nomeEscola;
    public TextView enderecoEscola;
    public TextView telefoneEscola;

    public EscolaViewHolder(View itemView) {
        super(itemView);

        this.nomeEscola = (TextView) itemView.findViewById(R.id.nomeEscola);
        this.enderecoEscola = (TextView) itemView.findViewById(R.id.enderecoEscola);
        this.telefoneEscola = (TextView) itemView.findViewById(R.id.telefoneEscola);
        itemView.setOnClickListener(this);

        RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) itemView.getLayoutParams();
        params.setMargins(35, 0, 0, 0);
        itemView.setLayoutParams(params);
    }

    @Override
    public void onClick(View view) {

    }
}
