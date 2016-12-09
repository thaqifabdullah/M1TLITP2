/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerlayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author abdullam
 */
public class Player extends JPanel{
	protected JButton playPause, previous, stop, next, backward, forward, listeLecteurs, equalizer;
	protected JSlider sound;
	protected JLabel infoChanson, duration;
	protected JPanel buttonsGroup, infoGroupLabel, groupRight, groupEqAndListe;
        protected JProgressBar progress;

	public Player(){
		initializeButtons();
		initializeSlider();
		initializeLabel();
                initializeProgress();
                initializePanel();
	}

	protected void initializeButtons(){
		playPause = new JButton("Play/Pause");
		previous = new JButton("Previous");
		stop = new JButton("Stop");
		next = new JButton("Next");
		listeLecteurs = new JButton("ListeLecteurs");
		equalizer = new JButton("Equalizer");
                backward = new JButton("backward");
                forward = new JButton("forward");
	}

	protected void initializeSlider(){
		sound = new JSlider(0,100);
		add(sound);
	}

	protected void initializeLabel(){
		infoChanson = new JLabel("Lecteur multimédia VLC");
                duration = new JLabel("00:00");
	}
        
        protected void initializeProgress(){
            progress = new JProgressBar(SwingConstants.HORIZONTAL);
            progress.setValue(0);
        }

	protected void initializePanel(){
		buttonsGroup = new JPanel();
                buttonsGroup.setLayout(new GridLayout(2,2));
                buttonsGroup.add(backward);
		buttonsGroup.add(playPause);
                buttonsGroup.add(forward);
		buttonsGroup.add(previous);
		buttonsGroup.add(stop);
		buttonsGroup.add(next);
		add(buttonsGroup);

		infoGroupLabel = new JPanel();
                infoGroupLabel.setLayout(new BorderLayout(10,10));
		infoGroupLabel.add(infoChanson, BorderLayout.WEST);
                infoGroupLabel.add(duration, BorderLayout.EAST);
                infoGroupLabel.add(progress, BorderLayout.SOUTH);
		
                
                groupEqAndListe = new JPanel();
                groupEqAndListe.add(equalizer);
                groupEqAndListe.add(listeLecteurs);
                
                groupRight = new JPanel();
                groupRight.setLayout(new BorderLayout(10,10));
                groupRight.add(infoGroupLabel, BorderLayout.NORTH);
                groupRight.add(sound, BorderLayout.WEST);
                groupRight.add(groupEqAndListe, BorderLayout.EAST);
                add(groupRight);
	}
}