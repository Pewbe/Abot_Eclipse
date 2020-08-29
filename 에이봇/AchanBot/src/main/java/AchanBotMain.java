import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.CustomEmoji;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.entities.message.MessageReceiver;
import de.btobastian.javacord.entities.message.embed.EmbedBuilder;
import de.btobastian.javacord.listener.message.MessageCreateListener;
 
public class AchanBotMain{
    static public void main(String args[]){
        DiscordAPI api = Javacord.getApi("NzQ1MTY5MTU2ODIyNzk0MzI4.Xzt22w.bndjbt4wWlIy2IhF5kP63vP3wFc", true);
        
        api.connect(new FutureCallback<DiscordAPI>() {
              public void onSuccess(final DiscordAPI api) {
            	  api.setGame("저도 밤에는 자러 가서 디코 못봐요~ 현실감 넘치는 봇이라구요?");
                  api.registerListener(new MessageCreateListener() {
                	  
                      public void onMessageCreate(DiscordAPI api, Message message) {
                    	  ScriptEngineManager mgr = new ScriptEngineManager();
                    	  ScriptEngine engine = mgr.getEngineByName("JavaScript");
                    	  String m = message.getContent();
                    	  
                    	  if( m.contains("에이군") || m.contains("에이쨩") || m.contains("에이야") || m.contains("エイちゃん")){
                    		  if( !m.equals("에이야") ) {
	                    		  EmbedBuilder embed = new EmbedBuilder();
	                    	      int love = 0;
	                    	      String msg;
	                    	     
	                    	      if(m. contains("배워")) {
	                    	    	  try {
		                    	          BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\자잘한거\\디코봇\\에이쨩봇\\CustomCommand.txt", true) );
		                    	          final PrintWriter pw = new PrintWriter( bw, true );
		                    	          
		                    	    	  msg = m.replace("에이야 배워 ", "");
		                    	     	  if( msg.contains(":") ) {
		    	                   	    	  String path = "C:\\Users\\user\\Desktop\\자잘한거\\디코봇\\에이쨩봇\\CustomCommand.txt";
		    	                   	    	  BufferedReader br = new BufferedReader(new FileReader(path));
		    	                  	    	  String buff;
		    	                   	    	  boolean isAlready = false;
		    	                   	    	  
		    	                   	    	  while( ( buff = br.readLine() ) != null )
		    	                   	    		  if( buff.equals( msg ) )
		    	                   	    			  isAlready = true;
		    	                   	    	  
		    	                   	    	  if( isAlready == true )
		    	                   	    		  message.reply("음.. 그 말은 이미 할 줄 아는걸요?");
		    	                   	    	  else { 
			                    	    		  pw.write( msg + "\n" );
			                    	    		  pw.flush();
			                    	    		  message.reply("알았어요! 다음부턴 이렇게 말하면 되죠?");
			                    	    		  pw.close();
		    	                   	    	  }
		                    	    	  } else
		                    	    		  message.reply("음..명령어를 제대로 입력해 주지 않으면 알아들을 수 없는걸요..");
	                    	    	  } catch (Exception e) { e.printStackTrace(); }
	                    	      }
	                    	      else if(m.contains("안녕") || m.contains("하이") || m.contains("반가워"))
	    	                          message.reply("반가워요! " + message.getUserReceiver().getName() + " 씨♬");
	                    	      else if(m.contains("おはよう"))
	    	                          message.reply("おはようございます！ユーザーさん♬");
	                    	      else if(m.contains("こんにちは"))
	    	                          message.reply("こんにちは！ユーザーさん♬");
	                    	      else if(m.contains("こんばんは"))
	    	                          message.reply("こんばんは！ユーザーさん♬");
	    	                      else if(m.contains("뭐해") || m.contains("뭐행") || m.contains("모해"))
	    	                          message.reply("딱히~?");
	                    	      else if(m.contains("심심해") || m.contains("심심행") || m.contains("심시매") || m.contains("심심하당"))
		                              message.reply("어디 가지 말고 저하고 놀자구요!");
	                    	      else if(m.contains("벗어")) {
	                    	    	  if(love >= 100)
	                    	    		  message.reply("으응~ 당신에게라면 뭐어...♪");
	                    	    	  else
	                    	    		  message.reply("..엣..!? 변태 아니예요!?\n..정말, 무슨 소릴 하는 거야..");
	                    	      }
	                    	      else if(m.contains("하자")) {
	                    	    	  if( love >= 100 )
	                    	    		  message.reply("..흐응~.... 그러고보면 오늘 밤에는 딱히 할 일 없을지도~..");
	                    	    	  else
	                    	    		  message.reply("우웅~? 무슨 이야기 하는 걸까나~ 하나도 모르겠는걸요오~?");
	                    	      }
	                    	      else if(m.contains("놀자") || m.contains("놀아줘") || m.contains("노라조"))
	     	                          message.reply("이 나이 먹고 놀이라고 하는 것도 좀 뭐하지만 당신이라면 뭐~");
	                    	      else if(m.contains("로봇 군"))
	     	                          message.reply("으응~ 로봇 군은 잘 있어요! 언젠가 로봇 군의 봇도 생길지도?\n음..그치만 로봇 군은 이미 로봇인걸요? 로봇의 봇이라니 뭐야 그거!");
	                    	      else if(m.contains("외계인"))
	     	                          message.reply("외계인 님이요? 그러고보니 최근 못 만났을지도..." + '\n' + "아무렴 어때요, 자기 별에 있거나 아님 어디서 또 뭔가 신나게 부수고 있거나. 둘 중 하나겠죠...");
	                    	      else if(m.contains("알려줘") || m.contains("도움말")) {
	                    	    	  embed.setColor( Color.GREEN );
	                    	    	  embed.setTitle("내 이름은 에이! 역사에 다시 없을 천재!");
	                    	    	  embed.setFooter("나랑 자주 대화해서 많이 많이 친해지자구요♥");
	                    	    	  embed.setDescription("에이는 당신만의 개인용 봇이예요." + "\n여러 사람이 있는 서버에서 사용할 시, 작동하지 않는 커맨드가 있을 수 있어요."
	                    	    			  + "\n개인 채팅방에서 단 둘이서만 이야기하는게 좋아요~!");
	                    	    	  embed.addField("에이야 (커맨드)", "저와 대화할 수 있어요!\n아직 모르는 말이 많지만, 그렇기에 많이 많이 가르쳐주시면 좋겠어요!", false);
	                    	    	  embed.addField("호감도", "저와 이야기할 때마다 호감도가 조금씩 올라요.\n호감도가 많을 때만 해 주는 말도 있으니까,\n저랑 많이 대화해서 많이 친해지자구요♬", false);
	                    	    	  embed.addField("에이야 배워 (명령어):(반응)", "저에게 말을 가르칠 수 있어요!\n아직 오류가 많은 기능이지만..\n앞으로 점점 더 발전해 나갈거니까요!", false);
	                    	    	  embed.addField("에이야 계산 (식)", "저어는 천재니까~... 어떤 식이든 계산해 드릴게요!\n(팩토리얼은 인식을 못 한다는 소문이 있어요..)", false);
	                    	    	  embed.addField("에이야 프로필 (이름)", "애프터라이프, 달토끼의 우주여행, 피지컬 엔젤스, 이름없는 유령 등..\n제가 속한 세계관 캐릭터의 프로필을 알려드립니다!\n굉장히 씹덕스런 기능이지만..\n여기서만 들을 수 있는 이야기들도 있으니까요? 후훗.", false);
	                    	    	  message.reply("저에 대해 알고 싶으신가요?", embed);
	                    	      }
	                    	      else if(m.contains("사랑해")) {
	                    	    	  if( love >= 100 )
	                    	    		  message.reply("저도 당신을 진짜, 지-인짜 사랑하는 거 알죠?");
	                    	    	  else
	                    	    		  message.reply("저도 어엄-청 사랑해요♥");
	                    	      }
	                    	      else if(m.contains("계산")) {
		                              try {
		                            	  String exp; 
		                            	  
		                            	  exp = m.replace("에이야 계산 ", "");
										message.reply( exp + " 의 계산 결과는 " + engine.eval(exp) + "♪" );
									} catch (ScriptException e) { e.printStackTrace(); }
	                    	      }
	                    	      else if( m.contains("369") ) {
	                    	    	  try {
	                    	    		  message.reply("응? 369게임이 하고 싶어요?");
	                    	    		  Thread.sleep( 300 );
	                    	    		  message.reply("좋아요! 그럼 저부터 할게요?");
	                    	    	  } catch (InterruptedException e) {e.printStackTrace();}
	                    	      }
	                    	      else if( m.contains("프로필") ) {
	                    	    	  if( m.contains("너") ) {
		                    	    	  embed.setColor( Color.GREEN );
		                    	    	  embed.setTitle("에이");
		                    	    	  embed.setDescription("\"제 이름은 에이! 세상에서 가장 평범한 천재!\"");
		                    	    	  embed.addField("-나이", "이렇게 보여도 27살 성인이라구요?", false);
		                    	    	  embed.addField("-키", "...으우.. 굳이 알려줘야 하나요...?\n에휴..그래요... 뭐, 135cm입니다만..\n뭔가 불만이라도~?...", false);
		                    	    	  embed.addField("-몸무게", "비-밀인걸요♪", false);
		                    	    	  embed.addField("-좋아하는 것/싫어하는 것", "좋아하는 것은 제가 모르는 것! 싫어하는 것은 재미없는 거예요~♩", false);
		                    	    	  embed.setFooter("아침 일찍 일어나는 건 아직도 힘들어요~");
		                    	    	  embed.setImage("https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile7.uf.tistory.com%2Fimage%2F24283C3858F778CA2EFABE");
		                    	    	  //이미지 링크 넣을때, 링크가 너무 길거나 이상하다 싶으면 바꾸셈. 그거 안되는듯. 썸네일도 마찬가지.
		                    	    	  embed.setThumbnail("C:\\Users\\user\\Desktop\\자잘한거\\글임\\27세유치원생2.jpg");
		                    	    	  message.reply("", embed);
	                    	    	  }
	                    	    	  else if( m.contains("리플리") ) {
	                    	    		  embed.setColor( Color.YELLOW );
		                    	    	  embed.setTitle("리플리");
		                    	    	  embed.setDescription("\"................\"");
		                    	    	  embed.addField("-나이", "19.", false);
		                    	    	  embed.addField("-키", "171cm.", false);
		                    	    	  embed.addField("-몸무게", "........", false);
		                    	    	  embed.addField("-좋아하는 것/싫어하는 것", ".............", false);
		                    	    	  embed.setFooter("워낙 말을 안 하려고 하니까.. 이 정도 알아내는 것도 힘들었다구요.");
		                    	    	  embed.setImage("https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile7.uf.tistory.com%2Fimage%2F24283C3858F778CA2EFABE");
		                    	    	  message.reply("", embed);
	                    	    	  }
	                    	    	  else if( m.contains("루퍼트") ) {
	                    	    		  embed.setColor( Color.ORANGE );
		                    	    	  embed.setTitle("루퍼트");
		                    	    	  embed.setDescription("\"이..이름.. 어차피.. 알려줘도 잊어버릴 거고... 애.. 애초에.. 다른 사람한테\n내 이름 따위.. 알려줘본 적.. 없지만...\"");
		                    	    	  embed.addField("-나이", "여..열...그러니까.. 열다섯..살..이예요..", false);
		                    	    	  embed.addField("-키", "그..최..최근에는 안 재 봤는데...1..157cm..정도...", false);
		                    	    	  embed.addField("-몸무게", "모..모르겠어요... 40kg..초반..이긴 했는데..", false);
		                    	    	  embed.addField("-좋아하는 것/싫어하는 것", "..우으..따..딱히 없어요.....", false);
		                    	    	  embed.setFooter("흐응~.. 상당한 애정결핍인데. 이 정도면 꽤 위험하다구요~?");
		                    	    	  message.reply("", embed);
	                    	    	  }
	                    	    	  else if( m.contains("유하") ) {
	                    	    		  embed.setColor( Color.WHITE );
		                    	    	  embed.setTitle("유하");
		                    	    	  embed.setDescription("\"그거, 위험하니까 조심해. 아. 그것도. 맞아. 모든 게 다 위험해.\n그러니까 항상 조심해야 해.\"");
		                    	    	  embed.addField("-나이", "응? 그러게. 나, 몇 살일까? 애초에, 자기 생일이나 나이를,\n아무에게나 알려주는 거. 위험하지 않아?", false);
		                    	    	  embed.addField("-키", "모르겠어. 재 본 적 없으니까. 160cm쯤, 되지 않을까?", false);
		                    	    	  embed.addField("-몸무게", "이건 알아. 아마 44kg. 이 정도일걸.", false);
		                    	    	  embed.addField("-좋아하는 것/싫어하는 것", "응. 나는 집이 좋아. 그러니까 빨리 집에 가고 싶네.\n집 밖은 굉장히 위험하니까. 위험한 건 싫어. 그런데 내 집이 어디더라?", false);
		                    	    	  embed.setFooter("처음 만났을 때 부터, 극심한 강박증에 기억 상실을 앓고 있더군요.\n정보를 알아내는 게 꽤 곤란했었어요.");
		                    	    	  message.reply("", embed);
	                    	    	  }
	                    	    	  else if( m.contains("이프") ) {
	                    	    		  embed.setColor( Color.DARK_GRAY );
		                    	    	  embed.setTitle("이프");
		                    	    	  embed.setDescription("\"\"");
		                    	    	  embed.addField("-나이", "", false);
		                    	    	  embed.addField("-키", "", false);
		                    	    	  embed.addField("-몸무게", "", false);
		                    	    	  embed.addField("-좋아하는 것/싫어하는 것", "", false);
		                    	    	  embed.setFooter("");
		                    	    	  message.reply("", embed);
	                    	    	  }
	                    	      }
	                    	      else if( m.contains("강퇴") ) {
	                    	      }
	                    	      else {
	                    	    	  try {
		                    	    	  String path = "C:\\Users\\user\\Desktop\\자잘한거\\디코봇\\"
		                    	    	  		+ "에이쨩봇\\CustomCommand.txt";
		                    	    	  BufferedReader br = new BufferedReader(new FileReader(path));
		                    	    	  String buff;
		                    	    	  String[] splitedArr;
		                    	    	  List<String> list = new ArrayList<String>();
		                    	    	  int cnt=0, rep;
		                    	    	  
		                    	    	  while( ( buff = br.readLine() ) != null ) {
		                    	    		  splitedArr = buff.split(":");
		                    	    		  if( splitedArr[0].equals( m.replace("에이야 ", "") ) ) {
		                    	    			  list.add( splitedArr[1] );
		                    	    			  cnt++;
		                    	    		  }
		                    	    	  }
		                    	    	  if( list.size() != 0 ) {
		                    	    		  rep = (int)(Math.random()*(cnt));
		                    	    		  message.reply( list.get(rep) );
		                    	    	  } else {
		                    	    		  int rand;
		    	                    	      rand = (int)(Math.random()*13);
		    	                    	      
		    	                    		  if( rand == 1 )
		    	                    			  message.reply("귀여운 저의 등장입니다★");
		    	                    		  else if( rand == 2 )
		    	                    			  message.reply("네-에♬");
		    	                    		  else if( rand == 3 )
		    	                    			  message.reply("불렀어요?");
		    	                    		  else if( rand == 4 )
		    	                    			  message.reply("[지금은 답장해 드릴 수 없습니다.]\n...거짓말이지만!");
		    	                    		  else if( rand == 5 )
		    	                    			  message.reply("아직 못 하는 말이 많아요~ 개발자 씨가 바보거든!");
		    	                    		  else if( rand == 6 )
		    	                    			  message.reply("흐흐흥~♬");
		    	                    		  else if( rand == 7 )
		    	                    			  message.reply("으응... 지금은 바쁜데에~\n...그치만 당신이 우선이니까~");
		    	                    		  else if( rand == 8 )
		    	                    			  message.reply(".....깜짝이야, 언제 오셨어요?");
		    	                    		  else if( rand == 9 )
		    	                    			  message.reply("우으응..졸려.. 왜요..?");
		    	                    		  else if( rand == 10 )
		    	                    			  message.reply("제가 동문서답 한다는 건, 그냥 할 말이 없는 거니까요~...");
		    	                    		  else if( rand == 11 )
		    	                    			  message.reply("...으응~.. 키 크고 싶다.");
		    	                    		  else if( rand == 12 )
		    	                    			  message.reply("제 이름은 에이! 역사에 다시 없을 천재!");
		                    	    	  }
	                    	    	  } catch (Exception e) { e.printStackTrace(); }
	                    	      }
                    		  }
                          }
                      }
                  });
              }
 
              public void onFailure(Throwable t) {
                t.printStackTrace();
              }
            });
    }
}